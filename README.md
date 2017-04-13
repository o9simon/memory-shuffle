# memory-shuffle
This is an algorithm to shuffle music.

## How it works
* The last n songs are kept in memory.
* The history depth (n) depends on the size of song library.
* A random song is selected using java.util.Random (or any other library to generate a random number)
* If the artist of the randomly selected song is the artist of one of the last n songs. A new song is randomly selected.
* If after 4 tries, a song from an artist not in the history couldn't be selected, stop trying to select a new song and select the current one.

## Example
Starting from this library :
```java
new Song[] {
	new Song("Britney Spears", "Toxic"),
	new Song("Johnny Cash", "Hurt"),
	new Song("White Stripes", "Seven Nation Army"),
	new Song("NOFX", "Franco Un-american"),
	new Song("NOFX", "Dinosaurs Will Die"),
	new Song("Black Flag", "Gimme Gimme Gimme"),
	new Song("Black Flag", "Wasted"),
	new Song("Black Flag", "Rise Above"),
	new Song("Black Flag", "Six Pack"),
	new Song("Circle Jerks", "Live Fast Die Young"),
	new Song("Circle Jerks", "Wild in the Streets"),
	new Song("Sum 41", "A Murder Of Crows"),
	new Song("Blink 182", "Adam's Song"),
	new Song("Blink 182", "All the Small Things"),
	new Song("The Bouncing Souls", "Rebels Song"),
	new Song("Against Me!", "Transgender Dysphoria Blues"),
	new Song("Bad Religion", "21st Century Boy"),
	new Song("Bad Religion", "Suffer"),
	new Song("System of a Down", "BYOB"),
};
```

A first execution of the algorithm (20 passes) returns this:
* Selected: White Stripes - Seven Nation Army
* Selected: Bad Religion - 21st Century Boy
* Selected: NOFX - Dinosaurs Will Die
* Selected: System of a Down - BYOB
* Selected: Blink 182 - All the Small Things
* Selected: Black Flag - Wasted
* Selected: Britney Spears - Toxic
* Selected: The Bouncing Souls - Rebels Song
* Selected: Circle Jerks - Live Fast Die Young
* Selected: Against Me! - Transgender Dysphoria Blues
* Selected: Johnny Cash - Hurt
* Selected: White Stripes - Seven Nation Army
* Selected: Bad Religion - 21st Century Boy
* Selected: NOFX - Franco Un-american
* Selected: System of a Down - BYOB
* Selected: Sum 41 - A Murder Of Crows
* Selected: Black Flag - Wasted
* Selected: Britney Spears - Toxic
* Selected: The Bouncing Souls - Rebels Song
* Selected: Circle Jerks - Wild in the Streets

And a second one, returns this:
* Selected: White Stripes - Seven Nation Army
* Selected: Black Flag - Wasted
* Selected: Against Me! - Transgender Dysphoria Blues
* Selected: Circle Jerks - Wild in the Streets
* Selected: Sum 41 - A Murder Of Crows
* Selected: NOFX - Franco Un-american
* Selected: Johnny Cash - Hurt
* Selected: Britney Spears - Toxic
* Selected: Bad Religion - Suffer
* Selected: The Bouncing Souls - Rebels Song
* Selected: Blink 182 - Adam's Song
* Selected: White Stripes - Seven Nation Army
* Selected: Black Flag - Six Pack
* Selected: Against Me! - Transgender Dysphoria Blues
* Selected: Circle Jerks - Live Fast Die Young
* Selected: System of a Down - BYOB
* Selected: Sum 41 - A Murder Of Crows
* Selected: Johnny Cash - Hurt
* Selected: NOFX - Franco Un-american
* Selected: Bad Religion - Suffer

And finally, a third one returns this:
* Selected: Black Flag - Rise Above
* Selected: Sum 41 - A Murder Of Crows
* Selected: The Bouncing Souls - Rebels Song
* Selected: Blink 182 - Adam's Song
* Selected: Britney Spears - Toxic
* Selected: Johnny Cash - Hurt
* Selected: Against Me! - Transgender Dysphoria Blues
* Selected: System of a Down - BYOB
* Selected: Circle Jerks - Live Fast Die Young
* Selected: NOFX - Franco Un-american
* Selected: Bad Religion - 21st Century Boy
* Selected: Black Flag - Wasted
* Selected: Sum 41 - A Murder Of Crows
* Selected: White Stripes - Seven Nation Army
* Selected: Blink 182 - All the Small Things
* Selected: The Bouncing Souls - Rebels Song
* Selected: Johnny Cash - Hurt
* Selected: Against Me! - Transgender Dysphoria Blues
* Selected: System of a Down - BYOB
* Selected: Circle Jerks - Wild in the Streets

## Improvements
The history doesn't have to be a history of songs, it could be a history of artists or artist identifiers.
