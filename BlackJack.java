/**
* @author  Trevor Richardson 
* @version 1.0 
* @since   04/14/2022 
**/

import java.util.Scanner;

public class BlackJack {
    int winCnt = 0;
    int lossCnt = 0;
    
    public void playGame() throws InterruptedException {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Black Jack! Enter 1 to play!");
        int play = scnr.nextInt();

        while(play == 1){

            int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
            int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);

            System.out.println("The House is showing: " + houseTotal);
            Thread.sleep(500);

            while(playerTotal < 22){
                System.out.println("Player's total is: " + playerTotal);
                Thread.sleep(500);
                System.out.println("Would you like to hit or stand? \n\t Enter 1 to hit, or enter 2 to stand.");
                Thread.sleep(500);
                
                int choice = scnr.nextInt();

                if (choice == 2 ){
                    break;
                } else if (choice == 1){
                    Card nextCard = deck.drawCard();

                    System.out.println("The player has been dealt the " + nextCard.declareCard());
                    playerTotal += nextCard.getValue(true);

                }else{
                    System.out.println("Invalid option, try again.");
                }
                Thread.sleep(500);
            }

            if (playerTotal >21){
                System.out.println("The player has busted! You lose :(");
                lossCnt++;
            } else {
                System.out.println("The player stands with " + playerTotal);
                Thread.sleep(500);
                System.out.println("The house will play next.\nThe house has " + houseTotal);
                Thread.sleep(500);

                while (houseTotal <17){
                    System.out.println("The house takes another card");
                    Card nextCard = deck.drawCard();
                    Thread.sleep(500);

                    System.out.println("The house has been dealt the " + nextCard.declareCard());
                    houseTotal += nextCard.getValue(true);

                    if (houseTotal<17){
                        System.out.println("The House keeps drawing ");
                        Thread.sleep(500);
                        continue;
                    } else if (houseTotal>17 &&houseTotal<22){
                        System.out.println("The House sits with " + houseTotal);
                        Thread.sleep(500);
                    }
                }

                if (playerTotal > houseTotal || houseTotal >21){
                    System.out.println("Player wins! :)");
                    winCnt++;
                } else if(playerTotal == houseTotal){
                    System.out.println("It's a draw!"); 
                } else {
                    System.out.println("The House wins! Sorry :(");
                    lossCnt++;
                }
                
            }

            Thread.sleep(500);
            System.out.println("Enter 1 to play again or Enter 2 to exit the application.");
            play = scnr.nextInt();
        }
        //scnr.close();
        System.out.println("Game Over!");
        System.out.println("\n" + "Player Wins: " + winCnt);
        System.out.println("Player Losses: " + lossCnt + "\n");
    }
}