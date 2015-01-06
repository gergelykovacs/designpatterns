/**
 * It is a scrollable Window that is an extended Window itself.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.decorator;

import be.whatshould.designpatterns.etc.decorator.ScrollBar;

public class ScrollableWindow extends ExtendedWindow {
	
	private WindowInterface window = null;
	
	public ScrollableWindow(WindowInterface window) {
		super(window);
		this.window = window;
	}

	@Override
	public void render() {		
		addScrollBar();
		super.render();
	}
	
	private void addScrollBar() {
		window.subscribe(new ScrollBar());
	}
}