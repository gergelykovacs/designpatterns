/**
 * A simple user representation with ability to get.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.mediator;

public class User {
	
	private String name; 
	
	public User(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void sendMessage(String message) {
		Mailer.post(this, message);		
	}
}