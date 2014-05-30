/**
 * Sometimes functionalities of an object should be hidden in which case 
 * the Proxy pattern can serve a helpful solution.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.structural.proxy.*;
import be.whatshould.designpatterns.etc.proxy.*;

public class MainProxy {
	
	public MainProxy() {
	}
	
	public static void main(String[] args) {
		
		FileHandlerInterface file = new FileManagerProxy("/home/theuser/user.txt");
		file.open();
		
		// Editing the file and writing the changes back. 
		file.write();
	}
}