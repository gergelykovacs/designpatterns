/**
 * Simple message container class to be created or sent.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.observer;

public class Message {
	
	private String message;
	
	public Message() {
	}
	
	public Message(String m) {
		message = m;
	}
	
	public void setText(String m) {
		message = m;
	}
	
	public String getText() {
		return message;
	}
}