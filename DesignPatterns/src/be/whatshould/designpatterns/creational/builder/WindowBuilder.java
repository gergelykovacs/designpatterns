/**
 * The Window creational methodology.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.builder;

import be.whatshould.designpatterns.etc.builder.*;

public class WindowBuilder {
	
	private WindowBuilder() {
	}
	
	public static Window getConsole() {
		Window window = new Window();
		window.addFrame(new ConsoleMenuBar());
		window.addFrame(new EditTextView());
		return window;
	}
	
	public static Window getGUI() {
		Window window = new Window();
		window.addFrame(new GUIMenuBar());
		window.addFrame(new TextView());
		return window;
	}
}