/**
 * Mediator pattern is used to exchange messages between users here and now. 
 * Mailer class will know (exactly) the way to send messages to the users only. 
 * A concrete example when users are connected via telnet and anybody can push 
 * messages that are propagated to the others but the way to send the messages 
 * to the others is decoupled and the Sender (Mailer) knows the exact way only.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.mediator.User;

public class MainMediator {
	
	public MainMediator() {
	}
	
	public static void main(String[] args) {
		
		User joe = new User("Joe");
		User jane = new User("Jane");
		
		joe.sendMessage("Hi Joe!\n\tHow are you?\n"+ jane.getName());
		jane.sendMessage("Hey Jane!\n\tThank's fine. Would you like to meet?\n"+ joe.getName());
		joe.sendMessage("Yes, let's meet at half past nine.\n"+ jane.getName());
	}
}