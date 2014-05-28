/**
 * The database Implementor that wraps the concrete DB handlers around.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.bridge;

public interface DBImplementorInterface {
	
	public void insertImpl(String key, String value);
	public String queryImpl(String key);
	public void updateImpl(String key, String newValue);
	public void deleteImpl(String key);
}