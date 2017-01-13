
/**
 * Class contains the types of Heroes you can choose from. Each Hero has different attributes and 
 * special abilities.
 * 
 * @author Nick Tang
 * @version 1.0
 */
public class Hero
{
    // instance variables - replace the example below with your own
    private int health;
    private int strength;
    private int rangestrength;
    private boolean doublehit = false;
    private int mana;
    private int magestrength;
    
    public void makeHero (String n)  {
        if(n.equals("Warrior")) {
            health = 130;
            strength = 20;
        }
        else if(n.equals("Mage")) {
            health = 100;
            strength = 10;
            mana = 100;
            magestrength = 30;
        }
        else if(n.equals("Ranger")) {
            health = 110;
            rangestrength = 15;
            doublehit = true;
        }
        else {
            System.out.println("invalid Hero class");
        }
    }
    
    //Gets current health
    public int getHealth(Hero player) {
        return player.health;
    }
    //Gets strength
    public int getStrength(Hero player) {
        return player.strength;
    }
    //Gets magestrength
    public int getMageStrength(Hero player) {
        return player.magestrength;
    }
    //Gets rangestrength
    public int getRangeStrength(Hero player) {
        return player.rangestrength;
    }
    //Gets mana
    public int getMana(Hero player) {
        return player.mana;
    }
    
    
    //Subtracts health
    public void takeDamage(Hero player, int n) {
        player.health=player.health-n;
    }
    //Adds health
    public void healDamage(Hero player, int n) {
        player.health=player.health+n;
    }
    //Subtracts mana
    public void takeMana(Hero player, int n) {
        player.mana=player.mana-n;
    }
    
    
    
}




// /**
//     /**
//      * Warrior class has the most health with no special abilities.
//      */
//     public warrior()
//     {
//         // initialise instance variables
//         health = 130;
//         strength = 20;
//     }
//     
//     /**
//      * Mage class has the attribute 'mana' which allows it to do secondary moves that has different
//      * effects.
//      */
//     public mage()
//     {
//         // initialise instance variables
//         health = 100;
//         strength = 10;
//         mana = 100;
//         magestrength = 30;
//     }
//     
//     /**
//      * Ranger class has the special ability to get a chance to hit twice in one turn.
//      */
//     public ranger()
//     {
//         // initialise instance variables
//         health = 110;
//         rangestrength = 15;
//         doublehit = true;
//     }
