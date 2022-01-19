import java.util.*;
import java.util.Scanner;

public class A4BlackJack {
    
    static int Ace = 1; //make an if statement for picking either 1 pr 11 when calculating the sum of the two cards.
    static int King = 10; 
    static int Queen = 10; 
    static int Jack = 10; 
    
    // picks a card from Ace to King
    public static int card() { 
        Random rand = new Random(); 
        int cardNum[] = {Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King};
        int test [][] = {cardNum, cardNum, cardNum, cardNum}; 
        int randSuit = rand.nextInt(4); 
        int randomCard = rand.nextInt(13);
        int card = test[randSuit][randomCard];
        System.out.println(randSuit + " " + randomCard); 
        return test[randSuit][randomCard]; 
        
    } 

    

    public static void main(String[] args) { 
        System.out.println(card()); 
    }

}
  
