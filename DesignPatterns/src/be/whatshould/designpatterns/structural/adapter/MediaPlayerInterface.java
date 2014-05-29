/**
 * Player implementation requirements.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.structural.adapter;

import be.whatshould.designpatterns.etc.enums.AudioTypes;

public interface MediaPlayerInterface {
	
	public void play(AudioTypes type, String name);
}