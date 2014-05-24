package be.whatshould.designpatterns.behavioral;

import be.whatshould.designpatterns.behavioral.StrategyDriveInterface;

public class StrategyDriveContext {
	
	private String name;
	
	private StrategyDriveInterface action;
	
	public StrategyDriveContext(String n) {
		name = n;
	}
	
	public void setAction(StrategyDriveInterface a) {
		action = a;
	}
	
	public StrategyDriveInterface getAction() {
		return action;
	}
	
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