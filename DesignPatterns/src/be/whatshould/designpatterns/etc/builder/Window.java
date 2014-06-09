/**
 * Simple container for Window elements.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.builder;

import java.util.List;
import java.util.ArrayList;

public class Window {
	
	private List<UIFrame> frames = new ArrayList<UIFrame>();
	
	public Window() {
	}
	
	public void addFrame(UIFrame frame) {
		frames.add(frame);
	}
	
	public void printElements() {
		for(UIFrame f : frames) {
			f.getType();
			f.getContent();
		}
	}
}