/**
 * Abstration for the `Text type` UI Element functionalities.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.abstractfactory;

public abstract class AbstractUITextElement {
	
	public abstract void setText(String t);
	public abstract String getText();
}