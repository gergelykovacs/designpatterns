/**
 * The class hides the complexity of the underlying tools by wrapping the around.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.facade;

import be.whatshould.designpatterns.etc.facade.*;

public class DrawTool {
	
	private DrawableInterface line = null;
	private DrawableInterface circle = null;
	private DrawableInterface square = null;
	
	public DrawTool() {
		line = new DrawableLine();
		circle = new DrawableCircle();
		square = new DrawableSquare();
	}
	
	public void drawLine() {
		line.draw();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}