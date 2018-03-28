import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 *
 * Anna Mary Starr
 * 3/21/18
 */
public class Player extends Game
{
    public String name;
    public double money;
    public double betMoney;
    private int handTotal;
    private ArrayList<Card> hand;
    
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String nm, int hndTotal, double mon)
    {
        this.name = nm;
        this.handTotal = hndTotal;
        hand = new ArrayList<Card>();
        this.money = mon;
    }
    
    public void bet()
    {
        System.out.println("How much would you like to bet?");
        double betMoney = scan.nextInt();
        System.out.print("Your Bet: $" + betMoney);
        money -= betMoney;
        System.out.println("\t Remaining Total: $" + money);
    }
    
    public void playTurn()
    {
        System.out.println("Would you like to hit or stay? (1= Hit, 2= Stay)");
        if (scan.nextInt() == 1)
        {
            hit();
        }
        else if (scan.nextInt() == 2)
        {
            stay();
        }
    }
    
    public void hit()
    {
        
    }
    
    public void stay()
    {
        
    }
    
    public int getHandTotal()
    {
        for (Card c: hand)
        {
            handTotal += c.getValue();
        }
        return handTotal;
    }

    public double winMoney()
    {
        return money += (2 * betMoney);
    }
    
    public double loseMoney()
    {
        return money -= betMoney;
    }
    
    public String toString()
    {
        return "The status of the hand is ";
    }

}
