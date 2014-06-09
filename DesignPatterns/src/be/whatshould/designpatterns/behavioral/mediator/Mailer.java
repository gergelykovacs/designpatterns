/**
 * The simple mailer.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.mediator;

public class Mailer {
	
	private Mailer() {
	}
	
	public static void post(User user, String message) {
		System.out.println("* New message to: <"+ user.getName() +">\n\t"+ message);
	}
}