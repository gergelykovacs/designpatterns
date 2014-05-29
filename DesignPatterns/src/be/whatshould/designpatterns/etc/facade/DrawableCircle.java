/**
 * A class that implements the circle drawing functionalities.
 * 
 * @author Gergely Kovacs <anonymous.gerego@gmail.com>
 */
package be.whatshould.designpatterns.etc.facade;

public class DrawableCircle implements DrawableInterface {
	
	public DrawableCircle() {
	}

	@Override
	public void draw() {
		System.out.println("You have drawn a circle.");
	}
}