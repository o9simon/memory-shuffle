# memory-shuffle
This is an algorithm to shuffle music.

## How it works
* The last 10 songs are kept in memory.
* A random song is selected using java.util.Random (or any other library to generate a random number)
* If the artist of the randomly selected song is the artist of one of the last 10 songs. A new song is randomly selected.
* If after 4 tries, a song from an artist not in the history couldn't be selected, stop trying to select a new song and select the current one.

## Output
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
* Generated: White Stripes - Seven Nation Army
* Generated: Bad Religion - 21st Century Boy
* Generated: NOFX - Dinosaurs Will Die
* Generated: System of a Down - BYOB
* Generated: Blink 182 - All the Small Things
* Generated: Black Flag - Wasted
* Generated: Britney Spears - Toxic
* Generated: The Bouncing Souls - Rebels Song
* Generated: Circle Jerks - Live Fast Die Young
* Generated: Against Me! - Transgender Dysphoria Blues
* Generated: Johnny Cash - Hurt
* Generated: White Stripes - Seven Nation Army
* Generated: Bad Religion - 21st Century Boy
* Generated: NOFX - Franco Un-american
* Generated: System of a Down - BYOB
* Generated: Sum 41 - A Murder Of Crows
* Generated: Black Flag - Wasted
* Generated: Britney Spears - Toxic
* Generated: The Bouncing Souls - Rebels Song
* Generated: Circle Jerks - Wild in the Streets

And a second one, returns this:
* Generated: White Stripes - Seven Nation Army
* Generated: Black Flag - Wasted
* Generated: Against Me! - Transgender Dysphoria Blues
* Generated: Circle Jerks - Wild in the Streets
* Generated: Sum 41 - A Murder Of Crows
* Generated: NOFX - Franco Un-american
* Generated: Johnny Cash - Hurt
* Generated: Britney Spears - Toxic
* Generated: Bad Religion - Suffer
* Generated: The Bouncing Souls - Rebels Song
* Generated: Blink 182 - Adam's Song
* Generated: White Stripes - Seven Nation Army
* Generated: Black Flag - Six Pack
* Generated: Against Me! - Transgender Dysphoria Blues
* Generated: Circle Jerks - Live Fast Die Young
* Generated: System of a Down - BYOB
* Generated: Sum 41 - A Murder Of Crows
* Generated: Johnny Cash - Hurt
* Generated: NOFX - Franco Un-american
* Generated: Bad Religion - Suffer

And finally, a third one returns this:
* Generated: Black Flag - Rise Above
* Generated: Sum 41 - A Murder Of Crows
* Generated: The Bouncing Souls - Rebels Song
* Generated: Blink 182 - Adam's Song
* Generated: Britney Spears - Toxic
* Generated: Johnny Cash - Hurt
* Generated: Against Me! - Transgender Dysphoria Blues
* Generated: System of a Down - BYOB
* Generated: Circle Jerks - Live Fast Die Young
* Generated: NOFX - Franco Un-american
* Generated: Bad Religion - 21st Century Boy
* Generated: Black Flag - Wasted
* Generated: Sum 41 - A Murder Of Crows
* Generated: White Stripes - Seven Nation Army
* Generated: Blink 182 - All the Small Things
* Generated: The Bouncing Souls - Rebels Song
* Generated: Johnny Cash - Hurt
* Generated: Against Me! - Transgender Dysphoria Blues
* Generated: System of a Down - BYOB
* Generated: Circle Jerks - Wild in the Streets
