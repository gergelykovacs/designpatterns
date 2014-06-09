/**
 * The menu bar GUI element.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.builder;

public class GUIMenuBar implements UIFrame {
	
	private static final String TYPE = GUIMenuBar.class.getSimpleName();
	
	public GUIMenuBar() {
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