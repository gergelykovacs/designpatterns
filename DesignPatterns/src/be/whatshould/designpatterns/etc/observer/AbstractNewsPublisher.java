/**
 * Specialization requirements for the News publishers to be satisfied.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.observer;

import be.whatshould.designpatterns.behavioral.observer.PublisherInterface;
import be.whatshould.designpatterns.behavioral.observer.SubscriberInterface;

public abstract class AbstractNewsPublisher implements PublisherInterface {
	
	public abstract void announceNews(String m);
	public abstract SubscriberInterface findSubscriberByName(String n);
}