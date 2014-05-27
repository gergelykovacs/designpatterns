/**
 * The driving context class that can store and handle the given 
 * strategy however it does not know any details about the actual strategy 
 * just wrapes it around. Strategy interface gives the polymorphic type reference 
 * to the underlying strategy specialization.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.strategy;

import be.whatshould.designpatterns.behavioral.strategy.StrategyDriveInterface;

public class StrategyDriveContext {
	
	private static Integer counter = 0;
	
	private String name;
	
	// The polymorphic reference to the specialized strategy.
	private StrategyDriveInterface action;
	
	
	public StrategyDriveContext() {
		counter++;
		name = "Car-"+ counter.toString();
	}
	
	public StrategyDriveContext(String n) {
		name = n;
		counter++;
	}
	
	public StrategyDriveContext setAction(StrategyDriveInterface a) {
		action = a;
		return this;
	}
	
	public StrategyDriveInterface getAction() {
		return action;
	}
	
	// The key method that will order the actual context to perform the command. 
	public void doCommand() {
		System.out.println("@"+ name +" is ordered to:");
		action.command();
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}