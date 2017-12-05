/**
 * Write a description of class DEMON here.
 * 
 * @author (Jesus Serna) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 80;
    private static final int MAX_DEMON_STR = 40;
    private static final int MIN_DEMON_STR = 20;
    private static final String CLASS_D = "Demon";

    /**
     * Constructor for objects of class DEMON
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            CLASS_D
        );
          
    }

}

