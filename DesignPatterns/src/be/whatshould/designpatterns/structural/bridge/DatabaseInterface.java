/**
 * A simple CRUD abstraction layer for expected DB functionalities.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.bridge;

public interface DatabaseInterface {
	
	public void insert(String key, String value);
	public String query(String key);
	public void update(String key, String newValue);
	public void delete(String key);
}