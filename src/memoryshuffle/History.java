package memoryshuffle;

public class History {

	private static final int HISTORY_DEPTH = 10;
	
	private Song[] history;
	
	public History() {
		history = new Song[HISTORY_DEPTH];
	}
	
	public void push(Song song) {
		Song temp;
		
		// Index 0 becomes the new song
		Song old = history[0];
		history[0] = song;
		
		// 1 becomes old 0
		// 2 becomes old 1
		// ...
		for (int i = 0; i < history.length - 1; i++) {
			temp = history[i + 1];
			history[i + 1] = old;
			old = temp;
		}
		
	}
	
	public boolean containsArtist(String artist) {
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				if (history[i].getArtist().equals(artist)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void print() {
		System.out.println("History:");
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				System.out.println(i + 1 + ": " + history[i].toString());
			} else {
				System.out.println(i + 1 + ": null");
			}
		}
	}
	
}
