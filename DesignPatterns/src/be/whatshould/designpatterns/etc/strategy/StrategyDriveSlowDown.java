/**
 * The specialized strategy that can be used in a given situation.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.strategy;

import be.whatshould.designpatterns.behavioral.strategy.StrategyDriveInterface;

public class StrategyDriveSlowDown implements StrategyDriveInterface {
	
	public StrategyDriveSlowDown() {
	}

	@Override
	public void command() {
		System.out.println("Slow down...");
	}
}