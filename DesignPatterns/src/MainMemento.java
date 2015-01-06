/**
 * The Memento pattern is demonstrated through the example when a user uses 
 * a web browser, looks up some pages and then the browser learns e.g., the 
 * URLs he or she had been visited before (history) and the user can go back 
 * or forward.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.etc.memento.*;

public class MainMemento {
	
	public MainMemento() {
	}
	
	public static void main(String[] args) {
		
		Browser browser = new Browser();
		History history = new History();
		
		browser.open("http://www.oracle.com");
		history.add(browser.getState());
		browser.dumpCurrentState();
		
		browser.open("https://github.com");
		history.add(browser.getState());
		browser.dumpCurrentState();
		
		browser.open("http://developer.android.com");
		history.add(browser.getState());
		browser.dumpCurrentState();
		
		browser.restoreState(history.get(1));
		browser.dumpCurrentState();
		
		browser.restoreState(history.get(0));
		browser.dumpCurrentState();
		
		// Psst! Incognito mode may come in handy next time.
		history.clear();
	}
}