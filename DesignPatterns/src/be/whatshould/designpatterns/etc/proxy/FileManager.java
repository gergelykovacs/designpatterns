/**
 * A file manager may have too many functionalities and this complexity 
 * might be hidden by a Proxy.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.proxy;

import be.whatshould.designpatterns.structural.proxy.FileHandlerInterface;

public class FileManager implements FileHandlerInterface {
	
	private String name = null;
	
	public FileManager(String n) {
		name = n;
	}

	@Override
	public void write() {
		System.out.println("Writing file to storage: "+ name);
		setPermissions();
	}
	
	public void setPermissions() {
		System.out.println("Default permissions set for: "+ name);
	}

	@Override
	public void open() {
		System.out.println("Opening file: "+ name);
	}
}