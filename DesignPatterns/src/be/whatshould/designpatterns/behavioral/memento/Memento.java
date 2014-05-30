/**
 * Memento stores the state of something that might need to be restored later.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.memento;

public class Memento {
	
	private String state = null;
	
	public Memento(String s) {
		state = s;
	}
	
	public String getState() {
		return state;
	}
}