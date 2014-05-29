/**
 * The audio player implementation that can handle internally 
 * developed player and a known format or passes the job to the adapter that 
 * might know which player should be used.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.adapter;

import be.whatshould.designpatterns.etc.enums.AudioTypes;
import be.whatshould.designpatterns.structural.adapter.MediaPlayerInterface;
import be.whatshould.designpatterns.structural.adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayerInterface {
	
	private MediaAdapter adapter = null;
	
	public AudioPlayer() {
	}

	@Override
	public void play(AudioTypes type, String name) {
		if(type == AudioTypes.FLAC) {
			System.out.println("@Internal FLAC player is called to play: "+ name);
		} else {
			adapter = new MediaAdapter(type);
			adapter.play(type, name);
		}
	}	
}