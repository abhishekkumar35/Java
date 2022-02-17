package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int position = calculateHighScorePosition(1000);
        displayHighScore("Abhishek kumar",position);

         position = calculateHighScorePosition(900);
        displayHighScore("Rahul kumar",position);

         position = calculateHighScorePosition(501);
        displayHighScore("Manoj kumar",position);

         position = calculateHighScorePosition(102);
        displayHighScore("Lanka kumar",position);
    }
    public static void displayHighScore(String playersName,int position){
        System.out.println(playersName + " managed to get into " + position + "st on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
            if(playerScore >= 1000){
                    //return 1;
                position = 1;
            }else if(playerScore >= 500 && playerScore < 1000){
                   // return 2;
                position = 2;
            }else if(playerScore > 100 && playerScore < 500 ){
                   // return 3;
                position = 3;
            } //else{
                return position;
              //  return 4;
           // }
            // to elimitate multiple return statement we can use variable to store result of the condition then return that variable value.
    }
}
