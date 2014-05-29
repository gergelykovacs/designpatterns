/**
 * The concrete implementation of the Winamp player's connection.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.adapter;

import be.whatshould.designpatterns.structural.adapter.MediaPlayerCollectionInterface;

public class WinampPlayer implements MediaPlayerCollectionInterface {
	
	public WinampPlayer() {
	}

	@Override
	public void playVLC(String name) {
		// does nothing
	}

	@Override
	public void wampPlay(String name) {
		System.out.println("@Winamp Player is called to play the file: "+ name);
	}	
}