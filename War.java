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
    
    private void StartWar()
    {
        while((g != goodArmy.size()) && (e != evilArmy.size()))
        {
            BattleTurn();
        }  
    }
    
    private void BattleTurn()
    {
        int attackedG = goodArmy.get(g).takedamage(evilArmy.get(e).damage());
        if(goodArmy.get(g).isDead())
            g++;
        
        int attackedE = evilArmy.get(e).takedamage(goodArmy.get(g).damage());
        if(evilArmy.get(e).isDead())
            e++;
    }
}
