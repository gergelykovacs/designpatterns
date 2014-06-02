/**
 * Implements a deep copy functionality and the class can be extended and used.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCopy implements PrototypeInterface, Serializable {
	
	public ObjectCopy() {
	}
	
	@Override
	public Object copy() {
		Object o = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			oos.flush();
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			o = ois.readObject();	
		} catch(Exception e) {
			System.out.println("Object copy failed: "+ e.getMessage());
		} finally {
			try {
				oos.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return o;
	}
}