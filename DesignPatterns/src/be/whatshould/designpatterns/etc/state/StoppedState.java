/**
 * A simple state representation (Stopped).
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.state;

import be.whatshould.designpatterns.behavioral.state.StateInterface;

public class StoppedState implements StateInterface {
	
	private static final String STATE_NAME = "Stopped";
	
	public StoppedState() {
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