/**
 * An extended intermediate window that will be extended.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.decorator;

import be.whatshould.designpatterns.etc.decorator.WindowItemInterface;

public class ExtendedWindow implements WindowInterface {
	
	private WindowInterface window = null;
	
	public ExtendedWindow(WindowInterface window) {
		this.window = window;
	}

	@Override
	public void render() {
		window.render();
	}

	@Override
	public void subscribe(WindowItemInterface item) {
		window.subscribe(item);
	}	
}