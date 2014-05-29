/**
 * A class that implements the line drawing functionalities.
 * 
 * @author Gergely Kovacs <anonymous.gerego@gmail.com>
 */
package be.whatshould.designpatterns.etc.facade;

public class DrawableLine implements DrawableInterface {
	
	public DrawableLine() {
	}

	@Override
	public void draw() {
		System.out.println("You have drawn a line.");
	}
}