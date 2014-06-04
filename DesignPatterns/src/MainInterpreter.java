/**
 * To demonstrate the Interpreter pattern a simple search ruleset is used.
 * Matching: where all atomic items should be matched by AND.
 * Containing: where all atomic items are tested against OR.
 * 
 * E.g., you may search for a complex expression and want to get tightly or 
 * loosely coupled results in some context. (You search for an expression in 
 * a forum and you pick a special topic as its context.)
 * 
 * Here a really dummy (not-real-life) robot-answer engine is applied. 
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.interpreter.Expression;
import be.whatshould.designpatterns.etc.enums.InterpreterCategories;
import be.whatshould.designpatterns.etc.enums.RuleTypes;
import be.whatshould.designpatterns.etc.interpreter.RulesetFactory;

public class MainInterpreter {
	
	public MainInterpreter() {
	}
	
	public static void main(String[] args) {
		
		// One can ask questions in strict or loose manner in the given categories and 
		// the interpreter tries to answer for that questions.
		
		// Ask about reading.
		Expression strictlyReading = RulesetFactory.getRulset(RuleTypes.MATCHING, InterpreterCategories.READING);
		Expression looselyReading = RulesetFactory.getRulset(RuleTypes.CONTAINING, InterpreterCategories.READING);
		
		System.out.println("Questions on reading.");
		System.out.println("Does a book have pages and sections? => "+ 
				strictlyReading.interpret("Does a book have pages and sections?"));
		System.out.println("Have you finished the book? => "+ 
				strictlyReading.interpret("Have you finished the book?"));
		System.out.println("Has Jane already finished the book? => "+ 
				looselyReading.interpret("Has Jane already finished the book?"));
		
		// Ask about running.
		Expression strictlyRunning = RulesetFactory.getRulset(RuleTypes.MATCHING, InterpreterCategories.RUNNING);
		Expression looselyRunning = RulesetFactory.getRulset(RuleTypes.CONTAINING, InterpreterCategories.RUNNING);
		
		System.out.println("\nQuestions on running.");
		System.out.println("Do runners have shoes, shirts or watches? => "+ 
				strictlyRunning.interpret("Do runners have shoes, shirts or watches?"));
		System.out.println("Do runners use life jacket? => "+ 
				strictlyRunning.interpret("HDo runners use life jacket?"));
		System.out.println("I guess runners run on running track and maybe has a cap. => "+ 
				looselyRunning.interpret("I guess runners run on running track and maybe has a cap."));
		
		// Ask about shopping.
		Expression strictlyShopping = RulesetFactory.getRulset(RuleTypes.MATCHING, InterpreterCategories.SHOPPING);
		Expression looselyShopping = RulesetFactory.getRulset(RuleTypes.CONTAINING, InterpreterCategories.SHOPPING);
		
		System.out.println("\nQuestions on shopping.");
		System.out.println("Finally, you must pay for goods in your cart. => "+ 
				strictlyShopping.interpret("Finally, you must pay for goods in your cart."));
		System.out.println("Everybody must pay in the shops who enter. (bad answer) => "+ 
				looselyShopping.interpret("Everybody must pay in the shops who enter."));
		System.out.println("Basically, you can buy vegetables in the grocery. => "+ 
				looselyShopping.interpret("Basically, you can buy toys in the grocery."));
	}
} 