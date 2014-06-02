/**
 * The car is the context in which the state appears.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.state;

import be.whatshould.designpatterns.behavioral.state.StateInterface;

public class Car implements VehicleInterface {
	
	private StateInterface state = null;
	
	public Car() {
	}

	@Override
	public StateInterface getState() {
		return state;
	}

	@Override
	public void setState(StateInterface s) {
		state = s;
	}
}