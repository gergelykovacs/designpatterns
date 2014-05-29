/**
 * In a Library it is useful if one can list all the books they have, so 
 * Iterator pattern is used to solve this task.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.etc.iterator.Library;
import be.whatshould.designpatterns.behavioral.iterator.IteratorInterface;

public class MainIterator {
	
	public MainIterator() {
	}
	
	public static void main(String[] args) {
		
		Library library = new Library();

		System.out.println("First\n");
		for(IteratorInterface it = library.iterator(); it.hasNext(); ) {
			System.out.println("@Book: "+ it.next());
		}
		
		System.out.println("\nSecond\n");
		IteratorInterface it = library.iterator();
		while(it.hasNext()) {
			System.out.println("@Book: "+ it.next());
		}
		
		it.rewind();
		
		System.out.println("\nThird\n");
		System.out.println("@Book: "+ (String)it.next());
	}
}