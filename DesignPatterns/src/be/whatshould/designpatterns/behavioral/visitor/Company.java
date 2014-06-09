/**
 * Any company must accept when the inspector comes.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.visitor;

public interface Company {
	
	public void accept(CompanyInspector inspector);
	public String getName();
}