package memoryshuffle;

import java.util.Random;

/**
 * This is based on the randomizers of Tetris the Grand Master (TGM) games.
 * 
 * The randomizer is a mix between the randomizer of TGM1 and the randomizer of TGM2.
 * This is not a 100% accurate port of the TGM randomizer.
 * 
 * For more information :
 * http://tetris.wikia.com/wiki/TGM_randomizer
 */
public class Main {
	private Song[] library = Library.getLibrary();
	private Random rand = new Random();
	private History history = new History(10); // History with a depth of 10
	
	public void generate() {
		Song randSong = getRandomSong();
		
		// Each time a song is generated, the shuffler will try a certain number of times
		// to generate a song that doesn't match any in the history.
		int tries = 1;
		while (history.containsArtist(randSong.getArtist()) || tries <= 4) {
			randSong = getRandomSong();
			tries++;
		}
		
		history.push(randSong);
		
		System.out.println("Generated: " + randSong.toString());
	}
	
	public void print() {
		history.print();
	}
	
	private Song getRandomSong() {
		return library[rand.nextInt(library.length)];
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		
		for (int i = 0; i < 20; i++) {
			main.generate();
		}
		
		main.print();
	}
	
}
	
	