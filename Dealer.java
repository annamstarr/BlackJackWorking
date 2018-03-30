
/**
 * Write a description of class Dealer here.
 *
 * Anna Mary Starr
 * 3/23/18
 */
public class Dealer extends Player
{
    /**
     * Constructor for objects of class Dealer
     */
    public Dealer()
    {
        super("Dealer", -1, 500);
    }
    
    public void playTurn() 
    {
        //if (d.getValue() < 17)
        // hit();
        //else if(d.getValue() >= 17)
        // stay();
    }
    
    public void hit()
    {

    }
    
    public void stay()
    {
        
    }
    
    public double winMoney()
    {
        return money += betMoney;
    }

}
