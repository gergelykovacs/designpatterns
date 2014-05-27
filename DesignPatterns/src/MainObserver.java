/**
 * Observer pattern main class that creates a News publiser, adds some 
 * subscribers with different types and notifies them about new stuffs.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.observer.*;
import be.whatshould.designpatterns.etc.observer.*;

public class MainObserver {
	
	public static final Integer EMAIL_SUBSCRIBERS = 3;
	public static final Integer SMS_SUBSCRIBERS = 2;
	public static final Integer LETTER_SUBSCRIBERS = 1;
	
	public MainObserver() {
	}
	
	public static void main(String[] args) {
		
		// Register a publisher.
		AbstractNewsPublisher publisher = new NewsPublisher();
		
		// Add some subscribers to the current publisher.
		for(Integer i = 0; i < EMAIL_SUBSCRIBERS; i++) {
			publisher.attachSubscriber(new EmailSubscriber("Email Subscriber "+ i.toString()));
		}
		
		for(Integer i = 0; i < SMS_SUBSCRIBERS; i++) {
			publisher.attachSubscriber(new SMSSubscriber("SMS Subscriber "+ i.toString()));
		}
		
		for(Integer i = 0; i < EMAIL_SUBSCRIBERS; i++) {
			publisher.attachSubscriber(new LetterSubscriber("Letter Subscriber "+ i.toString()));
		}
		
		// The publisher announces a news.
		publisher.announceNews("New shoes can be bought at Best Shop. Check it out.");
		
		// Then the publisher will decide to notify his/her subscribers.
		publisher.notifySubscribers();
		
		// But someone wants to unsubscribe from this annoying news.
		publisher.detachSubscriber(publisher.findSubscriberByName("Email Subscriber 2"));
		
		// Now the publisher has a great news again and notifies the remaining subscribers immediately.
		System.out.println("New notifition is going to be sent...\n");
		publisher.announceNews("I read a great blog post and here it is: dummy stuff...");
		publisher.notifySubscribers();
		
		publisher.detachSubscriber(publisher.findSubscriberByName("Letter Subscriber 0"));
	}
}