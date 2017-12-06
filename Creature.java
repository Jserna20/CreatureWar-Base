
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or dead. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Creature
{
    private int str;
    private int max_hp;
    private int hp;
    private String creatureType;
    
    /**
     * default constructor - this should never actually run
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
        creatureType = "";
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp, String creatureType) {
       //implement this
       this.str = str;
       this.hp = hp;
       this.creatureType = creatureType;
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage()
    {
        // implement this
        int damage = Randomizer.nextInt(str) + 1;
        return damage;            
    }
    
    public String creatureName()
    {
        return creatureType;
    }
        
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        //implement this
        if(hp > 0)
        return true;
        else
        return false; //change this
    }
    
    /**
     * Is this creature deceased?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isDead() {
        //implement this
        if(hp > 0)
        return false;
        return true; //change this
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int attack) 
    {
        // implement this
        System.out.println(creatureType + " has " + hp + " hp");
        int currentHP = hp - attack;
        System.out.println(creatureType + " took " + attack + " damage.");
        if((isAlive() == true) && (hp - attack > 0))
        {
            System.out.println(currentHP + " hp left.");
            hp = currentHP;
        }
        else
        {
            System.out.println(creatureType + " has died!");
            hp = 0;
        }
    }
    
}