/**
 * The storage representation of HerSQL database.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.bridge;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class HerSqlStorage {
	
	private Map<String,String> storage = new HashMap<String,String>();
	
	public HerSqlStorage() {
	}
	
	public void addHer(String key, String value) {
		storage.put(key, value);
		dumpStorage();
	}
	
	public void updateHer(String key, String newValue) {
		storage.put(key, newValue);
		dumpStorage();
	}
	
	public String getHer(String key) {
		return storage.get(key);
	}
	
	public void removeHer(String key) {
		storage.remove(key);
		dumpStorage();
	}
	
	private void dumpStorage() {
		System.out.println("\nStorage dump of Her:\n");
		
		Iterator it = storage.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> entry = (Map.Entry<String, String>) it.next();
			System.out.println("#key: "+ entry.getKey() +" #value: "+ entry.getValue());
		}
	}
}