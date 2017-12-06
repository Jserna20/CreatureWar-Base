import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    // instance variables - replace the example below with your own
    private int soldiers;
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    private ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    private int e = 0;
    private int g = 0;
    

    /**
     * Constructor for objects of class War
     */
    public War()
    {
      Army1(100);
      Army2(100);
    }
    
    public War(int army)
    {
       soldiers = army;
       Army1(army);
       Army2(army);
    }
    
    /**
     * 
     * Each time Army1 loops, a random number is generated between 
     */
    private void Army1(int Good) 
    {
        for (int i = 0; i < Good; i++) 
        {
            if (Randomizer.nextInt(2) == 1) 
            {
                goodArmy.add(new Human());
            } 
            else 
            {
                goodArmy.add(new Elf());
            }
        }   
    }


    /**
     * In this Army2 method,
     */
    private void Army2(int Evil)
    {
        for (int i = 0; i < Evil; i++) 
        {
            if (Randomizer.nextInt(2) == 1)
            {
                evilArmy.add(new CyberDemon());
            }
            else 
            {
                evilArmy.add(new Balrog());
            }
        }
    }
    
    public void GoToWar()
    {
        while((g != goodArmy.size()) && (e != evilArmy.size()))
        {
            BattleTurn();
        }
        
        if(g < e)
            System.out.println("The good Army has won with " + (goodArmy.size() - g) + " soldier(s) left.");
        else if(e < g)
            System.out.println("The evil Army has won with " + (evilArmy.size() - e) + " soldier(s) left.");
        else
            System.out.println("The armies have wiped each other out no one remains");
        
    }
    
    private void BattleTurn()
    {
        System.out.println("" + evilArmy.get(e).creatureName() + e + " attacked. "); 
        goodArmy.get(g).takeDamage(evilArmy.get(e).damage());
        if(goodArmy.get(g).isDead())
        {
            g++;
            if(g == goodArmy.size())
                return;
        }
            
        System.out.println("" + goodArmy.get(g).creatureName() + g + " attacked. ");
        evilArmy.get(e).takeDamage(goodArmy.get(g).damage());
        if(evilArmy.get(e).isDead())
            e++;
    }
}
