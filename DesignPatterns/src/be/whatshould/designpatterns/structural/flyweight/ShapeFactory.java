/**
 * The Factory creates the appropriate shape and stores that, as well. 
 * Each shape has one color instance only.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.flyweight;

import java.util.Map;
import java.util.HashMap;
import be.whatshould.designpatterns.etc.enums.ShapeTypes;
import be.whatshould.designpatterns.etc.flyweight.*;

public class ShapeFactory {
	
	private static Map<String, ShapeInterface> circle = new HashMap<String, ShapeInterface>();
	private static Map<String, ShapeInterface> square = new HashMap<String, ShapeInterface>();
	
	private ShapeFactory() {
	}
	
	public static ShapeInterface getShape(ShapeTypes type, String color) {
		ShapeInterface shape = null;
		if(type == ShapeTypes.CIRCLE) {
			shape = getShape(circle, color);
			if(shape == null) {
				shape = new Circle(color);
				circle.put(color, shape);
			}
		} else if (type == ShapeTypes.SQUARE) {
			shape = getShape(square, color);
			if(shape == null) {
				shape = new Square(color);
				square.put(color, shape);
			}
		}
		return shape;
	}
	
	private static ShapeInterface getShape(Map<String, ShapeInterface> list, String key) {
		System.out.println("List size: "+ list.size());
		return list.get(key);
	}
}