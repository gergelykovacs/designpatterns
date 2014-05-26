package be.whatshould.designpatterns.creational;

import be.whatshould.designpatterns.etc.UIElementTypes;

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