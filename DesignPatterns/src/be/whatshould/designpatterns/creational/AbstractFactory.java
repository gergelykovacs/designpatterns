package be.whatshould.designpatterns.creational;

import be.whatshould.designpatterns.etc.UIElements;

public abstract class AbstractFactory {
	
	public abstract AbstractUITextElement createTextElement(UIElements e);
	public abstract AbstractUINonTextElement createNonTextElement(UIElements e);
}