package com.anu.masterclass.basics;

public class MethodChallenge {

    public static void displayHighScorePosition(String playersName, int highScorePosition){
        System.out.println(playersName + " managed to get into a position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
        return 1;
        }else if(score >= 500 && score < 1000){
            return 2;
        } else if(score >= 100 && score < 500){
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Anu", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Anya", highScorePosition);

    }
}
