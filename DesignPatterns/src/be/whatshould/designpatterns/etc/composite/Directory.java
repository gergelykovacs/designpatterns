/**
 * An element from which a bundle can be composed.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.composite;

import java.util.List;
import java.util.ArrayList;

import be.whatshould.designpatterns.structural.composite.CompositeDirectoryTree;

public class Directory implements CompositeDirectoryTree {
	
	private String name = null;
	private String lastmod = null;
	private List<CompositeDirectoryTree> children = new ArrayList<CompositeDirectoryTree>();
	
	public Directory(String n, String m) {
		name = n;
		lastmod = m; 
	}

	@Override
	public void add(CompositeDirectoryTree item) {
		children.add(item);
	}

	@Override
	public List<CompositeDirectoryTree> getChildren() {
		return children;
	}

	@Override
	public void lastmod(String date) {
		lastmod = date;
		// propagate
		for(CompositeDirectoryTree d : children) {
			d.lastmod(date);
		}
	}
	
	@Override
	public String toString() {
		return new String(lastmod +" .. "+ name);
	}
}