/**
 * The Matching interpreter of an expression.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.interpreter;

import java.util.List;
import be.whatshould.designpatterns.behavioral.interpreter.Expression;

public class MatchingExpression implements Expression {
	
	private List<Expression> list;
	
	public MatchingExpression(List<Expression> l) {
		list = l;
	}

	@Override
	public boolean interpret(String context) {
		boolean match = true;
		for(Expression e : list) {
			match = match && e.interpret(context);
		}
		return match;
	}
}