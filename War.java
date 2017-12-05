
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
    private Creature[] goodGuys;
    private Creature[] badGuys;
    

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        // initialise instance variables
        soldiers = Randomizer.nextInt(25) + 1;
        goodGuys = new Creature[soldiers];
        fillGoodArmy();
        badGuys = new Creature[soldiers];
    }
    
    public War(int army)
    {
        soldiers = army;
        goodGuys = new Creature[soldiers];
        fillGoodArmy();
        badGuys = new Creature[soldiers];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fillGoodArmy()
    {
        // put your code here
        for(int i = 0; i < soldiers; i++)
        {
            if(Randomizer.nextInt(2) == 1)
                System.out.println("Make Elf");
            else
                System.out.println("Make Human");
            
            //goodGuys[i] = Whatever that it is
        }
    }
    
    public void fillBadArmy()
    {
        // put your code here
        for(int i = 0; i < soldiers; i++)
        {
            if(Randomizer.nextInt(2) == 1)
                System.out.println("Make CyberDemon");
            else
                System.out.println("Make Balrog");
            
            //badGuys[i] = Whatever that it is
        }
    }
}
