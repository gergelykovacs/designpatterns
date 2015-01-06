/**
 * The storage representation of HisSQL database.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.bridge;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class HisSqlStorage {
	
	private Map<String,String> storage = new HashMap<String,String>();
	
	public HisSqlStorage() {
	}
	
	public void addHim(String key, String value) {
		storage.put(key, value);
		dumpStorage();
	}
	
	public void updateHim(String key, String newValue) {
		storage.put(key, newValue);
		dumpStorage();
	}
	
	public String getHim(String key) {
		return storage.get(key);
	}
	
	public void removeHim(String key) {
		storage.remove(key);
		dumpStorage();
	}
	
	private void dumpStorage() {
		System.out.println("\nStorage dump of His:\n");
		
		@SuppressWarnings("rawtypes")
		Iterator it = storage.entrySet().iterator();
		
		while(it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String,String> entry = (Map.Entry<String, String>) it.next();
			System.out.println("#key: "+ entry.getKey() +" #value: "+ entry.getValue());
		}
	}
}