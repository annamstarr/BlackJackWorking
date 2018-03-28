/**
 * Write a description of class Card here.
 *
 * Anna Mary Starr
 * 3/21/18
 */
public class Card extends Deck
{
    public int value;
    public String suit;
    public String rank;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(int val, String st, String rnk)
    {
        this.value = val;
        this.suit = st;
        this.rank = rnk;
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    public String getSuit()
    {
        return this.suit;
    }
    
    public void setValue(Card c, int newValue)
    {
        c.value = newValue;
    }
    
    public void setSuit(Card c, String newSuit)
    {
        c.suit = newSuit;
    }
}
