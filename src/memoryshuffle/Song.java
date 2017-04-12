package memoryshuffle;

/**
 * POJO with the minimal information necessary for a shuffle.
 */
public class Song {
	
	private String artist;
	private String title;
	
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return artist + " - " + title;
	}
	
}
