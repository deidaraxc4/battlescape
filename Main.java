import java.util.*;
/**
 * Two player text based fighting game.
 * 
 * @author Nick Tang
 * @version 1.0
 */
public class Main
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class main
     */
    public static void main(String[] args) {
        intro();
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 select a class: Warrior, Mage, Ranger");
        String p1 = scanner.next();
        hero1.makeHero(p1);
        System.out.println("Player 2 select a class: Warrior, Mage, Ranger");
        String p2 = scanner.next();
        hero2.makeHero(p2);
        //battle simulator
        while(hero1.getHealth(hero1)>0 || hero2.getHealth(hero2)>0) {
            
        }
        
    }
    
    public static void help() {
        System.out.println("commands:");
    }
    
    public static void intro() {
        System.out.println("Welcome to Battlescape, a two player turn based fighting game.");
        System.out.println("There are three different hero classes: Warrior, Mage, Ranger");
        System.out.println("Each have their own unique stats and special abilities.");
        System.out.println("For help with commands type in 'help'");
    }


}
