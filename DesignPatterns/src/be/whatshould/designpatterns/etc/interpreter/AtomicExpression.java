/**
 * The atomic expression is the minimal building block of any expressions.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.interpreter;

import be.whatshould.designpatterns.behavioral.interpreter.Expression;

public class AtomicExpression implements Expression {
	
	private String atom = null;
	
	public AtomicExpression(String a) {
		atom = a.toLowerCase();
	}

	@Override
	public boolean interpret(String context) {
		return context.toLowerCase().contains(atom);
	}
}