/**
 * Wrapper for all the available or implemented states.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.state;

import be.whatshould.designpatterns.etc.state.VehicleInterface;

public interface StateInterface {
	
	public void applyTo(VehicleInterface vehicle);
	public String getStateName();
}