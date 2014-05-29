/**
 * Defining the ability to be iterable.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.iterator;

import be.whatshould.designpatterns.behavioral.iterator.IteratorInterface;

public interface ContainerInterface {
	
	public IteratorInterface iterator();
}