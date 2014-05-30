/**
 * A specialized logger that is responsible for logging error messages.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.chainofresponsibility;

import be.whatshould.designpatterns.behavioral.chainofresponsibility.Logger;

public class ErrorLogFacility extends Logger {
	
	public ErrorLogFacility(int level) {
		this.level = level;
	}

	@Override
	protected void write(String msg) {
		System.out.println("@ERROR: "+ msg);
	}
}