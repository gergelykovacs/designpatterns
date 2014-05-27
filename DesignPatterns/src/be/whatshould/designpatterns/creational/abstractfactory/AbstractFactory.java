/**
 * It wraps the available concrete factories around that can be used. 
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.abstractfactory;

import be.whatshould.designpatterns.etc.enums.UIElements;

public abstract class AbstractFactory {
	
	public abstract AbstractUITextElement createTextElement(UIElements e);
	public abstract AbstractUINonTextElement createNonTextElement(UIElements e);
}