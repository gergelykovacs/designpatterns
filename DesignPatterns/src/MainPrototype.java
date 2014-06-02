/**
 * Prototype is for creating duplicated object. 
 * There are three main way to achieve this goal.
 * 
 * Shallow copy:
 * 1. Implements the Java's Clonable built-in interface and override the clone() method of the 
 *    Object class and calls it as super.clone() and catch CloneNotSupportedException.
 *    
 * Deep copy:
 * 2. Implement the e.g., Prototype interface that defines a copy() method in which a new 
 *    object is returned while all the necessary settings are done by the method itself.
 *    
 * 3. Using Java's Serializable interface by which an object is serialized and unserialized 
 *    through IOStreams and ByteArrayStreams hence the result will be a deep copy.
 *      
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.creational.prototype.*;
import be.whatshould.designpatterns.etc.prototype.*;

public class MainPrototype {
	
	public MainPrototype() {
	}
	
	public static void main(String[] args) {
		
		SquareCloneableV1 sV1Original = new SquareCloneableV1("Square V1", 42);
		SquareCloneableV1 sV1Clone = (SquareCloneableV1) sV1Original.clone();
		System.out.println("Original: ["+ sV1Original.getName() +", "+ sV1Original.getWidth() +"]");
		System.out.println("Clone: ["+ sV1Clone.getName() +", "+ sV1Clone.getWidth() +"]\n");
		
		SquareCloneableV2 sV2Original = new SquareCloneableV2("Square V2", 127);
		SquareCloneableV2 sV2Clone = (SquareCloneableV2) sV2Original.copy();
		System.out.println("Original: ["+ sV2Original.getName() +", "+ sV2Original.getWidth() +"]");
		System.out.println("Clone: ["+ sV2Clone.getName() +", "+ sV2Clone.getWidth() +"]\n");
		
		SquareCloneableV3 sV3Original = new SquareCloneableV3("Square V3", 1492);
		SquareCloneableV3 sV3Clone = (SquareCloneableV3) sV3Original.copy();
		System.out.println("Original: ["+ sV3Original.getName() +", "+ sV3Original.getWidth() +"]");
		System.out.println("Clone: ["+ sV3Clone.getName() +", "+ sV3Clone.getWidth() +"]");
	}
}