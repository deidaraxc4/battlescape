
/**
 * Write a description of class RangeAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RangeAttack
{
    // instance variables - replace the example below with your own
    int health;
    int dmg,dmg2;
    int combo;
    boolean dub;
    /**
     * Constructor for objects of class RangeAttack
     */
    public RangeAttack()
    {
        // initialise instance variables
    }

    //Normal range attack: chance of a double hit
    public void rangeAtt(Hero player, Hero player2) {
        dub=doubleHit();
        health = player2.getHealth(player2);
        dmg = randomInt(0,player.getRangeStrength(player));
        if(dub=true) {
            dmg2 = randomInt(0,player.getRangeStrength(player));
            health = health - (dmg+dmg2);
            System.out.println("You fire 2 arrows hitting" +dmg+ "and" +dmg2);
        } else {
            health = health - dmg;
            System.out.println("You fire your arrow hitting" +dmg);
        }
    }
    
    //Determines if will hit twice: 1 in 5 chance
    public boolean doubleHit() {
        combo = randomInt(1,5);
        if(combo==1) {
            return true;
        } else {
            return false;
        }
    }
    
    // returns random number between min (inclusive) and max (inclusive)
    public static int randomInt(int min, int max) { 
        return min + (int)(Math.random() * (max - min + 1)); 
    }
    
}
