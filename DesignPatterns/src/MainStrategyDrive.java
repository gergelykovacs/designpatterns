import be.whatshould.designpatterns.behavioral.StrategyDriveContext;
import be.whatshould.designpatterns.etc.*;

public class MainStrategyDrive {
	
	public MainStrategyDrive() {
	}
	
	public static void main(String[] args) {
		StrategyDriveContext car1 = new StrategyDriveContext("Car1");
		StrategyDriveContext car2 = new StrategyDriveContext("Car2");
		
		car1.setAction(new StrategyDriveSpeedUp());
		car1.doCommand();
		car2.setAction(new StrategyDriveSpeedUp());
		car2.doCommand();
		
		car1.setAction(new StrategyDriveSpeedUp());
		car1.doCommand();
		car2.setAction(new StrategyDriveSlowDown());
		car2.doCommand();
		
		car1.setAction(new StrategyDriveSlowDown());
		car1.doCommand();
		car2.setAction(new StrategyDriveSpeedUp());
		car2.doCommand();
	}
}