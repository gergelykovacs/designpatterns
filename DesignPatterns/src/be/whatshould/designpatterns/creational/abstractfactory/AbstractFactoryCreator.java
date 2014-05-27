/**
 * It is used between the `Client` and the `Abstract Factory` as an implicit 
 * wrapper for creation. It has only a simple factory method to return the 
 * appropriate abstraction.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.abstractfactory;

import be.whatshould.designpatterns.etc.enums.UIElementTypes;

public class AbstractFactoryCreator {
	
	private static AbstractFactory f = null;
	
	private AbstractFactoryCreator() {
	}
	
	public static AbstractFactory getFactory(UIElementTypes pt) {
		if(pt == UIElementTypes.TEXT) {
			f = new UITextElementFactory();
		} else if(pt == UIElementTypes.NONTEXT) {
			f = new UINonTextElementFactory();
		}
		return f;
	}
}