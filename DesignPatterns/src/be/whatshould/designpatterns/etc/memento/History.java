/**
 * The history stores the visited URLs looked up by the browser.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.memento;

import java.util.List;
import java.util.ArrayList;
import be.whatshould.designpatterns.behavioral.memento.*;

public class History {
	
	private List<Memento> list = new ArrayList<Memento>();
	
	public History() {
	}
	
	public void add(Memento m) {
		list.add(m);
	}
	
	public Memento get(int i) {
		return list.get(i);
	}
	
	public void clear() {
		list.clear();
	}
}