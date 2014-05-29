/**
 * To demonstrate the Adapter pattern an audio player and a general 
 * purpose media player used while the adapter lies between them. 
 * Imagine the situation that we are using actually a file browser which 
 * knows the available/installed media players on the system and it can 
 * associate the media types with the appropriate media player. Now it is 
 * just about an audio player.
 *   
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.etc.adapter.AudioPlayer;
import be.whatshould.designpatterns.etc.enums.AudioTypes;

public class MainAdapter {
	
	public static void main(String[] args) {
		
		AudioPlayer player = new AudioPlayer();
		
		// Here and now a dynamic, safe media type detector is not implemented.
		
		// At first listen this. (clicked on the file)
		player.play(AudioTypes.MP3, "Nothing_Else_Matters.mp3");
		
		// Next comes the following e.g., double clicked on another item.
		player.play(AudioTypes.WAV, "Sweet_Child_O_Mine.wav");
		
		// And finally...
		player.play(AudioTypes.FLAC, "Stairway_to_Heaven.flac");
	}
}