/**
 * A simple constant text view element.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.builder;

public class EditTextView implements UIFrame {
	
	private static final String TYPE = EditTextView.class.getSimpleName();
	private static final String CONTENT = "Prompt: waiting for some commands $> _";
	
	public EditTextView() {
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