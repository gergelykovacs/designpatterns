/**
 * The concrete implementation of the VLC player's connection.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.adapter;

import be.whatshould.designpatterns.structural.adapter.MediaPlayerCollectionInterface;

public class VLCPlayer implements MediaPlayerCollectionInterface {
	
	public VLCPlayer() {
	}

	@Override
	public void playVLC(String name) {
		System.out.println("@VLC Player is called to play the file: "+ name);
	}

	@Override
	public void wampPlay(String name) {
		// does nothing
	}	
}