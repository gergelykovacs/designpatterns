/**
 * The composition, container wrapper.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.composite;

import java.util.List;

public interface CompositeDirectoryTree {
	
	public void add(CompositeDirectoryTree item);
	public void lastmod(String date);
	public List<CompositeDirectoryTree> getChildren();
}