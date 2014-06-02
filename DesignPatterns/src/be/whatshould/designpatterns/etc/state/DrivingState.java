/**
 * A simple state representation (Driving).
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.state;

import be.whatshould.designpatterns.behavioral.state.StateInterface;

public class DrivingState implements StateInterface {
	
	private static final String STATE_NAME = "Driving";
	
	public DrivingState() {
	}
	
	@Override
	public String getStateName() {
		return STATE_NAME;
	}

	@Override
	public void applyTo(VehicleInterface vehicle) {
		vehicle.setState(this);
	}
}