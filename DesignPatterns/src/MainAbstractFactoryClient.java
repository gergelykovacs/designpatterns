/**
 * The Factory Method pattern is used here to print the name of a 
 * product in e.g., a store. The product is created and its name is printed.
 *  
 * @author Gergely Kovacs  <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.creational.*;
import be.whatshould.designpatterns.etc.*;

public class MainAbstractFactoryClient {
	
	public MainAbstractFactoryClient() {
	}
	
	public static void main(String[] args) {
		
		AbstractFactory f1 = AbstractFactoryCreator.getFactory(UIElementTypes.TEXT);
		
		AbstractUITextElement b = f1.createTextElement(UIElements.BUTTON);
		AbstractUITextElement e = f1.createTextElement(UIElements.EDIT_TEXT);
		AbstractUITextElement c = f1.createTextElement(UIElements.TEXT_CLOCK);
		
		b.setText("Click Me!");
		e.setText("Lorem ipsum.");
		c.setText("2014-05-26 19:28:00");
		
		System.out.println("@Button: "+ b.getText());
		System.out.println("@EditText: "+ e.getText());
		System.out.println("@TextClock: "+ c.getText());
		
		AbstractFactory f2 = AbstractFactoryCreator.getFactory(UIElementTypes.NONTEXT);
		
		AbstractUINonTextElement i = f2.createNonTextElement(UIElements.IMAGE_VIEW);
		AbstractUINonTextElement s = f2.createNonTextElement(UIElements.SURFACE_VIEW);
		
		i.setName("Hello image view.");
		s.setName("Hello surface view.");
		
		System.out.println("@ImageView: "+ i.getName());
		System.out.println("@SurfaceView: "+ s.getName());
	}
}