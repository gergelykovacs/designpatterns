/**
 * It represents the Subscribers (concrete observers) who 
 * want to get email messages about news.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.observer;

import be.whatshould.designpatterns.behavioral.observer.SubscriberInterface;

public class EmailSubscriber extends AbstractNewsSubscriber implements SubscriberInterface {
	
	private Message message;
	
	private String name;
	
	public EmailSubscriber() {
	}
	
	public EmailSubscriber(String n) {
		name = n;
	}

	@Override
	public void update(Message incoming) {
		message = incoming;
		printIncomingMessage();
	}
	
	@Override
	public void printIncomingMessage() {
		System.out.println("@"+ name +" got a new email: "+ message.getText());
	}

	@Override
	public void setName(String n) {
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}
}