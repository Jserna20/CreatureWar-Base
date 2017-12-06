/**
 * Write a description of class BALROG here.
 * 
 * @author (Jesus Serna) 
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 100;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 40;
    private static final int MIN_BALROG_STR = 20;
    private static final String CLASS_D = "Balrog";

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            CLASS_D
        );
          
    }
    
    /**
     * Overriding the damage method
     * @return dmg
     */
    public int damage()
    {
        int dmg = 0;
        for(int i = 0; i < 2; i++)
        {
            if(i == 0)
                dmg = super.damage();
            else
                dmg += super.damage();
            
            if(Randomizer.nextInt(100) <= 4)
            {
                System.out.println("Dark Magic Attack!!");
                dmg += 50;
            }
        }
            
        return dmg;
    }

}