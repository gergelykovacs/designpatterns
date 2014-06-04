/**
 * Flyweight pattern is used to reduce the cost of creating and 
 * manipulating the large number of similar objects. In this example 
 * Shapes (circles) are created up to a limited number but their properties 
 * are changed multiple times. E.g., put circles on the screen randomly chosen 
 * from a color set and change their properties in each iteration. One color 
 * exists only once.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.etc.enums.ShapeTypes;
import be.whatshould.designpatterns.structural.flyweight.*;
import be.whatshould.designpatterns.etc.flyweight.*;

public class MainFlyweight {
	
	private static final String[] colors = {"Yellow", "Green", "Blue", "Red", "Black", "Orange"};
	
	private static final int MAX_ITERATIONS = 27;
	
	public MainFlyweight() {
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < MAX_ITERATIONS; i++) {
			Circle circle = (Circle) ShapeFactory.getShape(ShapeTypes.CIRCLE, getRandomColor());
			
			circle.setX(getRandomNumber(20*i));
			circle.setY(getRandomNumber(18*i));
			circle.setR(getRandomNumber(15*i));
			circle.draw();
			
			Square square = (Square) ShapeFactory.getShape(ShapeTypes.SQUARE, getRandomColor());
			
			square.setX(getRandomNumber(11*i));
			square.setY(getRandomNumber(9*i));
			square.setW(getRandomNumber(2*i));
			square.draw();
		}
	}
	
	// Random values:
	
	private static int getRandomNumber(int scale) {
		return (int)(scale*Math.random());
	}
	
	private static String getRandomColor() {
		return colors[(int)(colors.length*Math.random())];
	}
}