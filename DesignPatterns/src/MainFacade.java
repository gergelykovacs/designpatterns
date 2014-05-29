/**
 * By the use of Facade pattern an underlying complexity might be hidden.
 *   
 * @author gkovacs
 */
import be.whatshould.designpatterns.structural.facade.DrawTool;

public class MainFacade {
	
	public MainFacade() {
	}
	
	public static void main(String[] args) {
		
		DrawTool drawer = new DrawTool();
		
		drawer.drawCircle();
		drawer.drawLine();
		drawer.drawSquare();
	}
}