/**
 * The necessary functionalities for any iterable.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.iterator;

public interface IteratorInterface {
	
	public Object next();
	public boolean hasNext();
	public void rewind();
}