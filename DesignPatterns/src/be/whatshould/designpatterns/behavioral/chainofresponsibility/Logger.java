/**
 * The logger abstraction that knows and uses the log level responsibility 
 * chain. Here all the lower priority logs get the higher priority message.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.chainofresponsibility;

public abstract class Logger {
	
	public static final class Level {
		
		public static final int INFO = 0;
		public static final int WARN = 1;
		public static final int ERROR = 2;
	}
	
	protected int level;
	
	protected Logger next;
	
	public void add(int l, String msg) {
		// Lower priority levels also gets the message.
		// Strict equal will result that only one can capture the message.
		if(level <= l) {
			write(msg);
		}
		// Pass request to the next level. 
		if(next != null) {
			next.add(l, msg);
		}
	}
	
	public void setNext(Logger logger) {
		next = logger;
	}
	
	protected abstract void write(String msg);
}