/**
* @author  Trevor Richardson 
* @version 1.0 
* @since   04/14/2022 
**/

public class Card {
    
    private int value;
    private String suit;

    public Card(int value, String suit){

        this.value = value;
        this.suit = suit;
    }

    public String getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public int getValue(boolean isBlackJack ){
        if (!isBlackJack){
            return value;
        } else {
            if (value == 1){
                return 11;
            } else if (value > 10){
                return 10;
            } else {
                return value;
            }
        }
    }

    public String declareCard(){

        if (this.value == 11){
            return "The Jack of "+ suit;
        } else if (this.value == 12){
            return "The Queen of "+ suit;
        } else if (this.value == 13){
            return "The King of "+ suit;
        } else if (this.value == 1){
            return "The Ace of "+ suit;
        } else {
            return "The "+ value +" of "+ suit;
        }

    }
}


