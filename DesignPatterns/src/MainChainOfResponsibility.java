/**
 * The Chain-Of-Responsibility pattern is demonstrated by a logger where 
 * the log message should be captured by the appropriate logger instance 
 * relevant to the desired log level. 
 * Higher priority messages are pushed to the lower levels as well.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.chainofresponsibility.*;

public class MainChainOfResponsibility {
	
	public static void main(String[] args) {
		
		Logger log = LogFactory.getLogger();
		
		log.add(Logger.Level.WARN, "It is important to note.");
		log.add(Logger.Level.INFO, "Nothing special.");
		log.add(Logger.Level.ERROR, "Oops, you got a runtime exception.");
	}
}