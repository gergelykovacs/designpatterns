/**
 * In this example a simple driving strategy is used with the `Speed Up` and 
 * `Slow Down` strategies and the contexts of this situation are cars that can 
 * perform these strategies. (Factory also should be used for a nice solution but 
 * design patterns are not bind here.) 
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.StrategyDriveContext;
import be.whatshould.designpatterns.etc.*;

public class MainStrategyDrive {
	
	public MainStrategyDrive() {
	}
	
	public static void main(String[] args) {
		// Initialize two cars.
		StrategyDriveContext car1 = new StrategyDriveContext("The Car 1");
		StrategyDriveContext car2 = new StrategyDriveContext();
		
		System.out.println("Cars are ready to race.\n");
		
		// Order the cars to perform their chosen strategies. 
		car1.setAction(new StrategyDriveSpeedUp()).doCommand();
		car2.setAction(new StrategyDriveSpeedUp()).doCommand();
		
		car1.setAction(new StrategyDriveSpeedUp()).doCommand();
		car2.setAction(new StrategyDriveSlowDown()).doCommand();
		
		car1.setAction(new StrategyDriveSlowDown()).doCommand();
		car2.setAction(new StrategyDriveSpeedUp()).doCommand();
	}
}