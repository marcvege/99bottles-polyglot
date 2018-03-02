package com.song;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;

public class BeerSong {

    public static final String END_VERSE = "\n\n";
    public static final String END_SONG = "\n\n";

    public String singSong() {
        return sing(99, 100);
    }

    public String sing(int bottlesNumber, int versesNumber) {
        return iterate(bottlesNumber, i -> i - 1)
                .mapToObj(this::getVerse)
                .limit(versesNumber)
                .collect(joining(END_VERSE))
                + END_SONG;
    }

    private String getVerse(int bottlesNumber) {
        if (bottlesNumber == 0)
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";
        if (bottlesNumber == 1)
            return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.";
        if (bottlesNumber == 2)
            return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.";
        return String.format("%s bottles of beer on the wall, %s bottles of beer.\n" +
                        "Take one down and pass it around, %s bottles of beer on the wall.",
                bottlesNumber, bottlesNumber, bottlesNumber - 1);
    }

}