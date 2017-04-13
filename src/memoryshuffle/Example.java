package memoryshuffle;

public class Example {

	public static void run(int passes) {
		MemoryShuffle ms = new MemoryShuffle();
		
		for (int i = 0; i < passes; i++) {
			ms.selectSong();
		}
		
		ms.printHistory();
	}
	
	// Run the algorithm n times and
	// display how many times the same artist
	// played twice in a row.
	public static void displaySameArtistTwiceInARowCount(int passes) {
		MemoryShuffle ms = new MemoryShuffle();
		Song last = null;
		Song curr = null;
		int oops = 0; // When the same artist plays twice in a row.
		
		for (int i = 0; i < passes; i++) {
			curr = ms.selectSong();
			if (curr == last) {
				oops++;
			}
			last = curr;
		}
		
		System.out.println("Oops count: " + oops);
	}
	
}
