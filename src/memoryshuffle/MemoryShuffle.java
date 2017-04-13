package memoryshuffle;

import java.util.Random;

public class MemoryShuffle {

private static final int MAX_TRIES = 4;
	
	private Song[] library = Library.getLibrary();
	private Random rand = new Random();
	private History history = new History();
	
	public Song selectSong() {
		Song randSong = getRandomSong();
		
		// Each time a song is generated, the shuffler will try a certain number of times
		// to generate a song that doesn't match any in the history.
		int tries = 1;
		while (history.containsArtist(randSong.getArtist()) || tries <= MAX_TRIES) {
			randSong = getRandomSong();
			tries++;
		}
		
		history.push(randSong);
		
		System.out.println("Selected: " + randSong.toString());
		
		return randSong;
	}
	
	public void printHistory() {
		history.print();
	}
	
	private Song getRandomSong() {
		return library[rand.nextInt(library.length)];
	}
	
}
