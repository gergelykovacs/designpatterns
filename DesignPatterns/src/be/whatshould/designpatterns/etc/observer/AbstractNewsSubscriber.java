/**
 * Specialization requirements for the News subscribers to be satisfied.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.observer;

public abstract class AbstractNewsSubscriber {
	
	public abstract void printIncomingMessage();
}