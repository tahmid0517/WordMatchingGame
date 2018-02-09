package com.example.tahmid.wordmatchinggame;

import java.util.Random;

/**
 * Created by owner on 4/28/2016.
 */
public class WordGenerator {
    private static final String[] wordList =
            {"CAT","DOG","PLANE","COMPUTE","INTERNET","HISTORY","PUMPKIN","KINSMEN","SYSTEM","ROBOT","PROSPECT",
            "INTUITION","SUPER","CRYPT","DINNER","SLED","DRAGON","TIGER","UNIVERSE","CORNY"};
    private static Random rand = new Random();
    public static String getRandomWord(){
        int total = wordList.length;
        return wordList[rand.nextInt(total)];
    }
}
