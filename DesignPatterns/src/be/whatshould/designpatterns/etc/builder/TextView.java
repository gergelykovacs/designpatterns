/**
 * A simple constant text view element.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.builder;

public class TextView implements UIFrame {
	
	private static final String TYPE = TextView.class.getSimpleName();
	private static final String CONTENT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
	
	public TextView() {
	}

	@Override
	public void getType() {
		System.out.println("The frame's type is: "+ TYPE);
	}

	@Override
	public void getContent() {
		System.out.println("The frame's content is: "+ CONTENT);
	}
}