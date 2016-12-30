import java.util.ArrayList;
public class Main {

 public static void main(String[] args) {
  
   Deck z = new Deck();
   ArrayList <Card> hand1 = new ArrayList <Card>();
   ArrayList <Card> hand2 = new ArrayList <Card>();
   for (int i = 0; i<5; i++)
   {
    Card card1 = z.getTopCard();
    Card card2 = z.getTopCard();
    hand1.add(card1);
    hand2.add(card2);
   }
    int score1 = 0;
    int score2 = 0;
    for (int i = 0; i<5; i++)
    {
     score1 += hand1.get(i).pointValue(); 
    }
     for (int i = 0; i<5; i++)
    {
     score2 += hand2.get(i).pointValue(); 
    }
     System.out.println("Hand 1: total points " + score1);
     
     for (int i = 0; i<hand1.size(); i++)
     {
      System.out.println(hand1.get(i)); 
     }
  
     System.out.println("Hand 2: total points " + score2);
      
     for (int j = 0; j<hand2.size(); j++)
     {
      System.out.println(hand2.get(j)); 
     }
 
     if (score1 > score2)
     {
       System.out.println("Hand 1 wins");
     }
     else if (score2 > score1)
     {
      System.out.println("Hand 2 wins");
     }
     else 
       System.out.println("Hand 2 wins");
 }
}
