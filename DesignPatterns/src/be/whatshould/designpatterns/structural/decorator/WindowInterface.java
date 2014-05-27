/**
 * The abstration of a GUI window.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.decorator;

import be.whatshould.designpatterns.etc.decorator.WindowItemInterface;

public interface WindowInterface {
	
	public void render();
	public void subscribe(WindowItemInterface item);
}