/**
 * General purpose interface for the supported player implementations.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.adapter;

public interface MediaPlayerCollectionInterface {
	
	public void playVLC(String name);
	public void wampPlay(String name);
}