package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.behavioral.StrategyDriveInterface;

public class StrategyDriveSlowDown implements StrategyDriveInterface {
	
	public StrategyDriveSlowDown() {
	}

	@Override
	public void command() {
		System.out.println("Slow down...");
	}
}