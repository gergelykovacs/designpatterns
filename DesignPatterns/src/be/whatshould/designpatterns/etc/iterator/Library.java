/**
 * An iterable Library where one can `walk through` all the stored books.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.iterator;

import be.whatshould.designpatterns.behavioral.iterator.IteratorInterface;

public class Library implements ContainerInterface {
	
	private String[] books = {"The Big Book", "The Cook Book", "Nice Book", "Secret Book", "The Black Book"};
	
	private class Books implements IteratorInterface {
		
		private int position;
		
		public Books() {
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return books[position++];
			}
			return null;
		}

		@Override
		public boolean hasNext() {
			return position < books.length;
		}

		@Override
		public void rewind() {
			position = 0;
		}	
	}
	
	public Library() {
	}

	@Override
	public IteratorInterface iterator() {
		return new Books();
	}
}