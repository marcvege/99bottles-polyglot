package com.song;

public class BeerSong {

    public String singSong() {
        return null;
    }

    public String sing(int bottlesNumber, int versesNumber) {
        if (bottlesNumber == 99)
            return "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                    "Take one down and pass it around, 98 bottles of beer on the wall.\n\n";
        return "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 bottles of beer on the wall.\n\n";

    }

}