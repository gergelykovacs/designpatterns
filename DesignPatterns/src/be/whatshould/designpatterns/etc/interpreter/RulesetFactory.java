/**
 * Creates the appropriate ruleset relevant to the desired context.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.interpreter;

import java.util.List;
import java.util.ArrayList;
import be.whatshould.designpatterns.behavioral.interpreter.Expression;
import be.whatshould.designpatterns.etc.enums.InterpreterCategories;
import be.whatshould.designpatterns.etc.enums.RuleTypes;

public class RulesetFactory {
	
	private RulesetFactory() {
	}
	
	public static Expression getRulset(RuleTypes type, InterpreterCategories category) {
		Expression expression = null;
		if(category == InterpreterCategories.READING) {
			expression = getReadingInterpreter(type);
		} else if(category == InterpreterCategories.RUNNING) {
			expression = getRunningInterpreter(type);
		} else if(category == InterpreterCategories.SHOPPING) {
			expression = getShoppingInterpreter(type);
		}
		return expression;
	}
	
	// Building up the rulesets that will be used.
	
	private static Expression getReadingInterpreter(RuleTypes type) {
		Expression expression = null;
		if(type == RuleTypes.MATCHING) {
			List<Expression> l = new ArrayList<Expression>();
			
			l.add(new AtomicExpression("Book"));
			l.add(new AtomicExpression("Page"));
			l.add(new AtomicExpression("Section"));
			
			expression = new MatchingExpression(l);
			
		} else if(type == RuleTypes.CONTAINING) {
			List<Expression> l = new ArrayList<Expression>();
			
			l.add(new AtomicExpression("Book"));
			l.add(new AtomicExpression("Page"));
			l.add(new AtomicExpression("Section"));
			l.add(new AtomicExpression("Finished"));
			
			expression = new ContainingExpression(l);
		}
		return expression;
	}
	
	private static Expression getRunningInterpreter(RuleTypes type) {
		Expression expression = null;
		if(type == RuleTypes.MATCHING) {
			List<Expression> l = new ArrayList<Expression>();
			
			l.add(new AtomicExpression("Shoe"));
			l.add(new AtomicExpression("Shirt"));
			l.add(new AtomicExpression("Watch"));
			
			expression = new MatchingExpression(l);
			
		} else if(type == RuleTypes.CONTAINING) {
			List<Expression> l = new ArrayList<Expression>();
			
			l.add(new AtomicExpression("Running Track"));
			l.add(new AtomicExpression("Shoe"));
			l.add(new AtomicExpression("Shirt"));
			l.add(new AtomicExpression("Hat"));
			l.add(new AtomicExpression("Cap"));
			
			expression = new ContainingExpression(l);
		}
		return expression;
	}
	
	private static Expression getShoppingInterpreter(RuleTypes type) {
		Expression expression = null;
		if(type == RuleTypes.MATCHING) {
			List<Expression> l = new ArrayList<Expression>();
			
			l.add(new AtomicExpression("Cart"));
			l.add(new AtomicExpression("Pay"));
			
			expression = new MatchingExpression(l);
			
		} else if(type == RuleTypes.CONTAINING) {
			List<Expression> l = new ArrayList<Expression>();
			
			l.add(new AtomicExpression("Pay"));
			l.add(new AtomicExpression("Cart"));
			l.add(new AtomicExpression("Meat"));
			l.add(new AtomicExpression("Vegetable"));
			
			expression = new ContainingExpression(l);
		}
		return expression;
	}
}