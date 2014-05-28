/**
 * Implementation of the concrete HerSQL database handler.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.bridge;

import be.whatshould.designpatterns.structural.bridge.DBImplementorInterface;

public class HerSqlImplementation implements DBImplementorInterface {
	
	private HerSqlStorage storage = null;
	
	public HerSqlImplementation(HerSqlStorage s) {
		storage = s;
	}

	@Override
	public void insertImpl(String key, String value) {
		storage.addHer(key, value);
	}

	@Override
	public String queryImpl(String key) {
		return storage.getHer(key);
	}

	@Override
	public void updateImpl(String key, String newValue) {
		storage.updateHer(key, newValue);
	}

	@Override
	public void deleteImpl(String key) {
		storage.removeHer(key);
	}
}