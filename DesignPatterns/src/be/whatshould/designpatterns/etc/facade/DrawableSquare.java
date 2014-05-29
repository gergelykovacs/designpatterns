/**
 * A class that implements the square drawing functionalities.
 * 
 * @author Gergely Kovacs <anonymous.gerego@gmail.com>
 */
package be.whatshould.designpatterns.etc.facade;

public class DrawableSquare implements DrawableInterface {
	
	public DrawableSquare() {
	}

	@Override
	public void draw() {
		System.out.println("You have drawn a square.");
	}
}