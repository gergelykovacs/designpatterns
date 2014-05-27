/**
 * The Subscriber interface represents the Observer and is 
 * needed for type compatibility.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.observer;

import be.whatshould.designpatterns.etc.observer.*;

public interface SubscriberInterface {
	
	public void update(Message m);
	public void setName(String n);
	public String getName();
}