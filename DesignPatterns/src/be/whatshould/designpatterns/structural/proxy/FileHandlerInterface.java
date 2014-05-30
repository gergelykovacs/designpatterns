/**
 * Minimal functionalities of an abstract file handler.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.proxy;

public interface FileHandlerInterface {
	
	public void open();
	public void write();
}