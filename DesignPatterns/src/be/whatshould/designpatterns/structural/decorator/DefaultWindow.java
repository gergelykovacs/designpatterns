/**
 * It is the overall default window that can be extended, decorated.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.decorator;

import java.util.Set;
import java.util.TreeSet;
import be.whatshould.designpatterns.etc.decorator.WindowItemInterface;

public class DefaultWindow implements WindowInterface {
	
	private Set<WindowItemInterface> children = new TreeSet<WindowItemInterface>();
	
	public DefaultWindow() {
	}

	@Override
	public void render() {
		for(WindowItemInterface c : children) {
			c.render();
		}
		System.out.println("Default window is rendered.");
	}

	@Override
	public void subscribe(WindowItemInterface subscriber) {
		children.add(subscriber);
	}	
}