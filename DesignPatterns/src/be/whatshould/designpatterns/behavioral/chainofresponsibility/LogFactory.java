/**
 * Creates a logger with the appropriate responsibility chain.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.chainofresponsibility;

import be.whatshould.designpatterns.etc.chainofresponsibility.*;

public class LogFactory {
	
	private LogFactory() {
	}
	
	public static Logger getLogger() {
		
		Logger info = new InfoLogFacility(Logger.Level.INFO);
		Logger warn = new WarnLogFacility(Logger.Level.WARN);
		Logger error = new ErrorLogFacility(Logger.Level.ERROR);
		
		error.setNext(warn);
		warn.setNext(info);
		
		return error;
	}
}