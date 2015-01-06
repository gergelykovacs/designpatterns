/**
 * It represents a scrollbar that is a simple Window element.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.decorator;

public class ScrollBar implements WindowItemInterface, Comparable<Object> {
	
	public ScrollBar() {
	}

	@Override
	public void render() {
		System.out.println("Scrollbar is rendered.");
	}

	@Override
	public int compareTo(Object o) {
		// We will have only one item so just skip it now, but important for Sets.
		return 0;
	}
}