/**
 * Creates the appropriate player and make it adaptable for internal use.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.adapter;

import be.whatshould.designpatterns.etc.enums.AudioTypes;
import be.whatshould.designpatterns.etc.adapter.*;

public class MediaAdapter implements MediaPlayerInterface {
	
	private MediaPlayerCollectionInterface player = null;
	
	private static class PlayerFactory {
		
		private PlayerFactory() {
		}
		
		public static MediaPlayerCollectionInterface getPlayer(AudioTypes type) {
			if(type == AudioTypes.MP3) {
				return new WinampPlayer();
			} else if(type == AudioTypes.WAV) {
				return new VLCPlayer();
			}
			return null;
		}
	}
	
	public MediaAdapter(AudioTypes type) {
		player = PlayerFactory.getPlayer(type);
	}

	@Override
	public void play(AudioTypes type, String name) {
		if(type == AudioTypes.MP3) {
			player.wampPlay(name);
		} else if(type == AudioTypes.WAV) {
			player.playVLC(name);
		} else {
			System.out.println("Unsupported file format.");
		}
	}
}