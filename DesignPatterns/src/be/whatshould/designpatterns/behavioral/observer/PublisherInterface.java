/**
 * Wrapping the necessary functionalities around that an Observable 
 * should know.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.observer;

public interface PublisherInterface {
	
	public void attachSubscriber(SubscriberInterface s);
	public void detachSubscriber(SubscriberInterface s); 
	public void notifySubscribers();
}