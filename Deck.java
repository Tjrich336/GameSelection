/**
* @author  Trevor Richardson 
* @version 1.0 
* @since   04/14/2022 
**/

public class Deck {
    public Card drawCard(){
        
        int value = (int)(Math.random()*12)+1;
        int cardSuit = (int)(Math.random()*3)+1;
        String suit;

        if (cardSuit ==1){
            suit = "Spades";
        } else if (cardSuit == 2){
            suit = "Clubs";
        } else if (cardSuit == 3){
            suit = "Hearts";
        } else {
            suit = "Diamonds";
        }

        return new Card(value, suit);
    }
}