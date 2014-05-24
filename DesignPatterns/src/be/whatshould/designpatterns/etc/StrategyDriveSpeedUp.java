package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.behavioral.StrategyDriveInterface;

public class StrategyDriveSpeedUp implements StrategyDriveInterface {
	
	public StrategyDriveSpeedUp() {
	}

	@Override
	public void command() {
		System.out.println("Speed up...");
	}
}