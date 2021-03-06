

/**
 * Write a description of class Human here.
 * 
 * @author (Jesus Serna) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 25;
    private static final int MIN_HUMAN_HP = 5;
    private static final int MAX_HUMAN_STR = 20;
    private static final int MIN_HUMAN_STR = 5;
    private static final String CLASS_H = "Human";

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP,    
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR,
            CLASS_H
        );
          
    }

}

