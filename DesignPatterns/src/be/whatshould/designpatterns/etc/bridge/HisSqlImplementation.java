/**
 * Implementation of the concrete HisSQL database handler.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.bridge;

import be.whatshould.designpatterns.structural.bridge.DBImplementorInterface;

public class HisSqlImplementation implements DBImplementorInterface {
	
	private HisSqlStorage storage = null;
	
	public HisSqlImplementation(HisSqlStorage s) {
		storage = s;
	}

	@Override
	public void insertImpl(String key, String value) {
		storage.addHim(key, value);
	}

	@Override
	public String queryImpl(String key) {
		return storage.getHim(key);
	}

	@Override
	public void updateImpl(String key, String newValue) {
		storage.updateHim(key, newValue);
	}

	@Override
	public void deleteImpl(String key) {
		storage.removeHim(key);
	}
}