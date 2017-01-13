import java.lang.Math;
/**
 * Spells that mage class can cast.
 * 
 * @author Nick Tang
 * @version 1.0
 */
public class Spells
{
    // instance variables - replace the example below with your own
    int mana;
    int health;
    int dmg;

    /**
     * Constructor for objects of class Spells
     */
    public Spells()
    {
        // initialise instance variables
    }
    //Healing spell: costs 10 mana, heals 10-20hp randomly
    public void healingTouch(Hero player) {
        mana = player.getMana(player);
        health = randomInt(10,20);
        if(mana > 10) {
            player.healDamage(player,health);
            System.out.println("You have healed yourself, you healed" +health+ "points");
        } else {
            System.out.println("Insufficient mana");
        }
    }
    //Attack spell: costs 15 mana, deals 0-max magestrength randomly
    public int manaBurst(Hero player, Hero player2) {
        mana = player.getMana(player);
        health = player2.getHealth(player2);
        dmg = randomInt(0,player.getMageStrength(player));
        if(mana > 15) {
            player.takeDamage(player2,dmg);
            System.out.println("You strike your opponent with a burst of energy, your hit was" +dmg);
        } else {
            System.out.println("Insufficient mana");
        }
        return dmg;
    }
    //Attack spell: costs 30 mana, deals 10-max magestrength*2 randomly
    public void manaSurge(Hero player, Hero player2) {
        mana = player.getMana(player);
        dmg = randomInt(10,player.getMageStrength(player)*2);
        if(mana > 15) {
            player.takeDamage(player2,dmg);
            System.out.println("You strike your opponent with a fearsome blast, your hit was" +dmg);
        } else {
            System.out.println("Insufficient mana");
        }
    }
    
    // returns random number between min (inclusive) and max (inclusive)
    public static int randomInt(int min, int max) { 
        return min + (int)(Math.random() * (max - min + 1)); 
    }

    
}
