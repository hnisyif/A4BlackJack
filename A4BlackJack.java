import java.util.*;
import java.util.Scanner;

public class A4BlackJack {
    
    static int[] Ace = {1,11}; 
    static int King = 10; 
    static int Queen = 10; 
    static int Jack = 10; 
    
    
   /* public int card(int cardRank) {
        String[] cardNum = {"Unused", Ace, "2", "3", "4", "5", "6", "7", "8", "9", "10", Jack, Queen, King};
        int randomCard = randomNumGenerator.nextInt(13) + 1;
        System.out.println(cardNum[randomCard]);
    } */

    public static void main(String[] args) {
        Random randomNumGenerator = new Random();
        int[] cardNum = {0 , Ace[], 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King};
        int randomCard = randomNumGenerator.nextInt(13) + 1;
        System.out.println(cardNum[randomCard]);
    }

}
  
