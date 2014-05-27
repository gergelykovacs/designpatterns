/**
 * The concrete News publisher registers his/her subscribers in a list 
 * and implements the necessary functionalities.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.observer;

import java.util.List;
import java.util.ArrayList;
import be.whatshould.designpatterns.etc.observer.AbstractNewsPublisher;
import be.whatshould.designpatterns.etc.observer.Message;

public class NewsPublisher extends AbstractNewsPublisher {
	
	private List<SubscriberInterface> subscribers = new ArrayList<SubscriberInterface>();
	
	private Message news;
	
	public NewsPublisher() {
	}

	@Override
	public void attachSubscriber(SubscriberInterface s) {
		subscribers.add(s);
	}

	@Override
	public void detachSubscriber(SubscriberInterface s) {
		if(subscribers.remove(s)) {
			System.out.println("\n@"+ s.getName() +" has successfully unsubscribed.\n");
		}
	}

	@Override
	public void notifySubscribers() {
		for(SubscriberInterface s : subscribers) {
			s.update(news);
		}
	}

	@Override
	public void announceNews(String m) {
		news = new Message(m);
	}

	@Override
	public SubscriberInterface findSubscriberByName(String n) {
		for(SubscriberInterface s : subscribers) {
			if(s.getName().equals(n)) {
				return s;
			}
		}
		return null;
	}
}