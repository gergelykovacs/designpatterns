/**
 * Composite pattern is demonstrated by a directory tree where they `lastmod` 
 * property can be modified as they would be only a single folder so change 
 * is propagated.
 * 
 * root/
 *   |- child_11/ #
 *   |     |- child_21/ ##
 *   |     `- child_22/ ##
 *   |
 *   `- child_12/
 *         |- child_23/
 *         `- child_24/
 * 
 * If (#)'s property is changed then all the (##) are changed, as well, 
 * like it would be a group property.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import java.util.Calendar;
import be.whatshould.designpatterns.etc.composite.Directory;
import be.whatshould.designpatterns.structural.composite.CompositeDirectoryTree;

public class MainComposite {
	
	public MainComposite() {
	}
	
	public static void main(String[] args) {
		
		// Creating the directory objects.
		CompositeDirectoryTree root = new Directory("Root", Calendar.getInstance().getTime().toString());
		
		CompositeDirectoryTree child1Level1 = new Directory("C11", Calendar.getInstance().getTime().toString());
		CompositeDirectoryTree child2Level1 = new Directory("C12", Calendar.getInstance().getTime().toString());
		
		CompositeDirectoryTree child1Level2 = new Directory("C21", Calendar.getInstance().getTime().toString());
		CompositeDirectoryTree child2Level2 = new Directory("C22", Calendar.getInstance().getTime().toString());
		CompositeDirectoryTree child3Level2 = new Directory("C23", Calendar.getInstance().getTime().toString());
		CompositeDirectoryTree child4Level2 = new Directory("C24", Calendar.getInstance().getTime().toString());
		
		System.out.println(child1Level2.toString());
		System.out.println(child2Level2.toString());
		
		// Building the tree.
		root.add(child1Level1);
		root.add(child2Level1);
		child1Level1.add(child1Level2);
		child1Level1.add(child2Level2);
		child2Level1.add(child3Level2);
		child2Level1.add(child4Level2);
		
		// A single change:
		child1Level1.lastmod("It is changed.");
		System.out.println("\nThe directory is changed: "+ child1Level1.toString() +"\n");
		
		// The effect:
		System.out.println(child1Level2.toString());
		System.out.println(child2Level2.toString());
	}
} 