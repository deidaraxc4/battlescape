
/**
 * Write a description of class MeleeAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeleeAttack
{
    // instance variables - replace the example below with your own
    int health;
    int dmg;
    /**
     * Constructor for objects of class MeleeAttack
     */
    public MeleeAttack()
    {
        // initialise instance variables
    }
    
    //Stab attack: deals 0-max strength randomly
    public void stab(Hero player, Hero player2) {
        health = player2.getHealth(player2);
        dmg = randomInt(0,player.getStrength(player));
        System.out.println("You stab your opponent dealing" +dmg+ "damage");
    }
    
    // returns random number between min (inclusive) and max (inclusive)
    public static int randomInt(int min, int max) { 
        return min + (int)(Math.random() * (max - min + 1)); 
    }
    
}
