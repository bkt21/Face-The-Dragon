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
        System.out.println("increaseHealth");
        Resources Potion = null;
        int potionsToUse = 5;
        Character Player = null;
        PlayerControl instance = new PlayerControl();
        int expResult = 95;
        int result = instance.increaseHealth(Potion, potionsToUse, Player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
