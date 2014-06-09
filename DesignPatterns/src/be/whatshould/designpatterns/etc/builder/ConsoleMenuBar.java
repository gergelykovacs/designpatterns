/**
 * The menu bar for Consoles.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.builder;

public class ConsoleMenuBar implements UIFrame {
	
	private static final String TYPE = ConsoleMenuBar.class.getSimpleName();
	
	public ConsoleMenuBar() {
	}

	@Override
	public void getType() {
		System.out.println("The frame's type is: "+ TYPE);
	}

	@Override
	public void getContent() {
		// Unavailable for menu bars.
	}
}