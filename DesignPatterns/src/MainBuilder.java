/**
 * To demonstrate Builder pattern a simple Window is built from 
 * different types of UI Frames. Two group of frames will be 
 * available to be built
 * 		- Console
 * 		- GUI
 * and each of them are built from frames like menu bar and a text view 
 * but the Console contains a editable text view. 
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.creational.builder.WindowBuilder;
import be.whatshould.designpatterns.etc.builder.Window;

public class MainBuilder {
	
	public MainBuilder() {
	}
	
	public static void main(String[] args) {
		
		Window console = WindowBuilder.getConsole();
		console.printElements();
		
		Window gui = WindowBuilder.getGUI();
		gui.printElements();
	}
}