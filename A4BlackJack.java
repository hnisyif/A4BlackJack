import java.util.*;
import java.util.Scanner;

public class A4BlackJack {
    
    static int Ace = 1; 
    static int Jack = 11;
    static int Queen = 12;
    static int King = 13;
    
    // picks a card from Ace to King
    public static String card() { 
        Random rand = new Random(); 
        int cardNum[] = {Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King};
        int suit [][] = {cardNum, cardNum, cardNum, cardNum};
        int randSuit = rand.nextInt(4);
        int randomCard = rand.nextInt(13);
        int card = suit[randSuit][randomCard];
        // Testing
        System.out.println(randSuit + " " + randomCard); 
        return getSuit(randSuit) + String.valueOf(suit[randSuit][randomCard]);
    }

    public static int getCardValue(String card) {
        int value = Integer.parseInt(card.substring(1));
        if(value > 10) {
            value = 10;
        }
        return value;
    }
    
    public static String getSuit(int suit) {
        String s = "";
        if(suit == 0) {
            s = "\u2665";
        } else if(suit == 1) {
            s = "\u2666";
        } else if(suit == 2) {
            s = "\u2663";
        } else if(suit == 3) {
          s = "\u2660";
        }
        return s; 
    }
    
    public static void drawCard(String card) {
        char suit = card.charAt(0);
        char[] corners = {'┌', '┘', '└', '┐'};
        int value = Integer.parseInt(card.substring(1));
        String valueS = "N";
        if(value == 11) {
            valueS = "J";
        } else if(value == 12) {
            valueS = "Q";
        } else if(value == 13) {
            valueS = "K";
        } else if(value == 1) {
            valueS = "A";
        } else {
            valueS = String.valueOf(value);
        }
        
        if(value < 10 || value > 10) {
            System.out.println(corners[0] + "─────────" + corners[3]);
            System.out.println("│" + valueS + "        │");
            System.out.println("│         │");
            System.out.println("│    "+ suit +"    │");
            System.out.println("│         │");
            System.out.println("│        " + valueS + "│");
            System.out.println(corners[2] + "─────────" + corners[1]);
        } else if(value == 10) {
            System.out.println(corners[0] + "─────────" + corners[3]);
            System.out.println("│" + valueS + "       │");
            System.out.println("│         │");
            System.out.println("│    "+ suit +"    │");
            System.out.println("│         │");
            System.out.println("│       " + valueS + "│");
            System.out.println(corners[2] + "─────────" + corners[1]);
        }
    } //close drawCard
       

    public static void main(String[] args) {
        String card = card();
        drawCard(card);
        // System.out.println(getCardValue(card));
        
    } // close main 

} // close class 
  
