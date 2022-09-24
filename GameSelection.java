/**
* @author  Trevor Richardson
* @version 1.0 
* @since   04/14/2022 
**/

import java.util.Scanner;
public class GameSelection {
    public static void main(String[] args) throws InterruptedException {
        int choice = 0;
            while (choice != 3){
                System.out.println("Choose your desired Game: ");
                System.out.println("");
                System.out.println("Enter 1 to play a game of Black Jack: ");
                System.out.println("Enter 2 to play a game of High Low: ");
                System.out.println("Enter 3 to exit the program: ");

                Scanner scan = new Scanner(System.in);
                choice = scan.nextInt();

                if (choice == 1){
                    BlackJack blackJackGame = new BlackJack();
                    blackJackGame.playGame();
                }
                else if (choice == 2){
                    HighLow highLowGame = new HighLow();
                    highLowGame.playGame();
                }
            }
            System.out.println("You have successfully exited the application!");
        




    }
}
