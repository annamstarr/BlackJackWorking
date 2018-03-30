
/**
 * Write a description of class Game here.
 *
 * Anna Mary Starr
 * 3/21/18
 */
public class Game
{
    Player[] players;
    Player p = new Player("Player 1", 0, 500);
    Player d = new Dealer();
    
    // Constructor for objects of class Game
    public Game()
    {
        players = new Player[2];
        p = players[0];
        d = players[1];
    }
    
    public void play()
    {
        p.bet();
        while (d.getHandTotal() <= 22 && p.getHandTotal() <= 22)
        {
           d.playTurn();
           p.playTurn();
        }
        determineWinner();
    }
    
    //Determines winner and distributes money to rightful winner
    public String determineWinner()
    {
        if (p.getHandTotal() > d.getHandTotal() && p.getHandTotal() <= 21)
        {
            p.winMoney();
            d.loseMoney();
            return "You won!";
        }
        else
        {
            d.winMoney();
            return "Sorry, the dealer won.";
        }
    }
    
}
