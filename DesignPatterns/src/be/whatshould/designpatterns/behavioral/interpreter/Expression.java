/**
 * The interpreted expression wrapper.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.interpreter;

public interface Expression {
	
	public boolean interpret(String context);
} 