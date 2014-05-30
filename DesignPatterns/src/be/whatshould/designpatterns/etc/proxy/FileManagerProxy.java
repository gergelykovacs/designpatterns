/**
 * A Proxy may hide the underlying complexity of an object.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.proxy;

import be.whatshould.designpatterns.structural.proxy.FileHandlerInterface;

public class FileManagerProxy implements FileHandlerInterface {
	
	private FileHandlerInterface fm = null;
	
	public FileManagerProxy(String n) {
		fm = new FileManager(n);	
	}

	@Override
	public void open() {
		fm.open();
	}

	@Override
	public void write() {
		fm.write();		
	}
}