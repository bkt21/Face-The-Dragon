/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Character;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Murray
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of attack method, of class BattleControl.
     */
    @Test
    public void testAttack() {
        System.out.println("Test 1");
        Character Attacker = new Character();
        Character Defender = new Character();
        Attacker.setAttack(15);
        Defender.setDefense(10);
        Defender.setHealth(10);
        BattleControl instance = new BattleControl();
        int expResult = 5;
        int result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        /***
         * Test 2
         */
        System.out.println("Test 2");
        Attacker.setAttack(-5);
        Defender.setDefense(5);
        Defender.setHealth(15);
        expResult = -1;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        /***
         * Test 3
         */
        System.out.println("Test 3");
        Attacker.setAttack(-5);
        Defender.setDefense(5);
        Defender.setHealth(15);
        expResult = -1;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        /***
         * Test 2
         */
        System.out.println("Test 2");
        Attacker.setAttack(-5);
        Defender.setDefense(5);
        Defender.setHealth(15);
        expResult = -1;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
    }
    
}
