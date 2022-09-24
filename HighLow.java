/**
* @author  Trevor Richardson 
* @version 1.0 
* @since   04/14/2022 
**/

import java.util.Scanner;
public class HighLow {
    public void playGame(){
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        int winCnt = 0;
        int lossCnt = 0;
    
        System.out.println("Welcome to High or Low! Enter 1 to play!");
        int loop = scnr.nextInt();

        while (loop == 1){
        Card card1 = deck.drawCard();
        System.out.println("The first card is " + card1.declareCard());
        System.out.println("Will the next card be higher or lower?");
        System.out.println("Enter 1 for lower, 2 for higher.");
    
        int choice = scnr.nextInt();
        Card card2 = deck.drawCard();
        System.out.println("The next card is the " + card2.declareCard());

        boolean higher = card2.getValue()>card1.getValue();
        if (card1.getValue() == card2.getValue()){
            System.out.println("Card values were the same, no winner or loser this round.");
        } 
        else if ((higher&&choice == 2) || (!higher&&choice == 1)){
            System.out.println("Winner!");
            winCnt ++;
        }
        else{
            System.out.println("Sorry, your guess was incorrect.");
            lossCnt ++;
        }

        System.out.println("Would you like to play again? Type 1 to play again, type 2 to exit this application.");
        loop = scnr.nextInt();
        if (loop == 2){
            System.out.println("Game Over!" + "\n");
            System.out.println("Wins: " + winCnt );
            System.out.println("Losses: " +  lossCnt + "\n");
        }
      }
    }
  }


