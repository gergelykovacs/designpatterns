/**
 * A specialized logger that is responsible for logging warn messages.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.chainofresponsibility;

import be.whatshould.designpatterns.behavioral.chainofresponsibility.Logger;

public class WarnLogFacility extends Logger {
	
	public WarnLogFacility(int level) {
		this.level = level;
	}

	@Override
	protected void write(String msg) {
		System.out.println("@WARNING: "+ msg);
	}
}