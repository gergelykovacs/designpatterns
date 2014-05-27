/**
 * Abstration for the `Non-Text type` UI Element functionalities.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.abstractfactory;

public abstract class AbstractUINonTextElement {
	
	public abstract void setName(String n);
	public abstract String getName();
}