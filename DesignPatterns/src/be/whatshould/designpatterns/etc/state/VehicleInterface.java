/**
 * A simple vehicle wrapper.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.state;

import be.whatshould.designpatterns.behavioral.state.StateInterface;

public interface VehicleInterface {
	
	public StateInterface getState();
	public void setState(StateInterface state);
}