/**
 * The browser opens a page given by the URL or tells it as its current state.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.memento;

import be.whatshould.designpatterns.behavioral.memento.*;

public class Browser {
	
	private String state = null;
	
	public Browser() {
	}
	
	public void open(String url) {
		state = url;
	}
	
	public Memento getState() {
		return new Memento(state);
	}
	
	public void restoreState(Memento m) {
		state = m.getState();
	}
	
	public void dumpCurrentState() {
		System.out.println("You are now browsing the page: "+ state);
	}
}