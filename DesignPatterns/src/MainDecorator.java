/**
 * A GUI Window is `created` first, a simple window e.g., with a menu bar. 
 * The user opens a file, and then the window needs to be changed to a 
 * scrollable version. (It is not a real life solution!)
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.structural.decorator.*;

public class MainDecorator {
	
	public MainDecorator() {
	}
	
	public static void main(String[] args) {
		
		// On start a simple (default) window is created.
		WindowInterface window = new DefaultWindow();
		window.render();
		
		// The user opens e.g., a file and that is rendered so window needs to be updated.
		
		// Change to scrollable window.
		window = new ScrollableWindow(window);
		window.render();
	}
}