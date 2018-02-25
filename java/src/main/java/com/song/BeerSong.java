package com.song;

public class BeerSong {

    public String sing(int bottlesNumber, int versesNumber) {
        if (versesNumber == 2)
            return getVerseForBottlesNumber(bottlesNumber) +
                    getVerseForBottlesNumber(bottlesNumber - 1);
        if (versesNumber == 3)
            return getVerseForBottlesNumber(bottlesNumber) +
                    getVerseForBottlesNumber(bottlesNumber - 1) +
                    getVerseForBottlesNumber(bottlesNumber - 2);
        return getVerseForBottlesNumber(bottlesNumber);
    }

    public String singSong() {
        return null;
    }

    private String getVerseForBottlesNumber(int bottlesNumber) {
        if (bottlesNumber == 0)
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
        if (bottlesNumber == 1)
            return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        if (bottlesNumber == 2)
            return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
        return String.format(
                "%d bottles of beer on the wall, %d bottles of beer.\n" +
                        "Take one down and pass it around, %d bottles of beer on the wall.\n\n",
                bottlesNumber, bottlesNumber, bottlesNumber - 1);
    }
}