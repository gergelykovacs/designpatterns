/**
 * The State pattern is demonstrated as a car's state that may be 
 * driving or stopped.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.etc.state.*;

public class MainState {
	
	public MainState() {
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		DrivingState drivingState = new DrivingState();
		drivingState.applyTo(car);
		System.out.println("The car is in ("+ car.getState().getStateName() +") state.");
		
		StoppedState stoppedState = new StoppedState();
		stoppedState.applyTo(car);
		System.out.println("The car is in ("+ car.getState().getStateName() +") state.");
	}
}