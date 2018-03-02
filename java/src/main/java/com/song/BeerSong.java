package com.song;

public class BeerSong {

    public String singSong() {
        return null;
    }

    public String sing(int bottlesNumber, int versesNumber) {
        if (bottlesNumber == 1)
            return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";

        if (bottlesNumber == 2)
            return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";

        return String.format("%s bottles of beer on the wall, %s bottles of beer.\n" +
                        "Take one down and pass it around, %s bottles of beer on the wall.\n\n",
                bottlesNumber, bottlesNumber, bottlesNumber - 1);


    }

}