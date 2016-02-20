/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Character;
import byui.cit260.FaceTheDragon.model.Resources;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brittany
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of increaseHealth method, of class PlayerControl.
     */
    @Test
    public void testIncreaseHealth() {
        System.out.println("Test 1 IncreseHealth");
        Resources Potion = new Resources ();
        Character Player = new Character();
        PlayerControl instance = new PlayerControl(); 
        Potion.setQuantity(5);
        Potion.setIncreaseHealth(5);
        Player.setMaxHealth(30);
        Player.setHealth(20); // this will have to be less as the max health or the same unless you are checking for errors
        int potionsToUse = 1;
        int expResult = 25;
        int result = instance.increaseHealth(Potion, potionsToUse, Player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
