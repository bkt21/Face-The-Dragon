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
        System.out.println("Test 1 att");
        Character Attacker = new Character();
        Character Defender = new Character();
        Attacker.setAttack(15);
        Defender.setDefense(10);
        Defender.setHealth(10);
        BattleControl instance = new BattleControl();
        int result = instance.attack(Attacker, Defender);
        if(result >= 2 && result <= 8){
            result = 5;
        }
        int expResult = 5;
        assertEquals(expResult, result);
        
        /***
         * Test 2
         */
        System.out.println("Test 2 att");
        Attacker.setAttack(-5);
        Defender.setDefense(5);
        Defender.setHealth(15);
        expResult = -1;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        /***
         * Test 3
         */
        System.out.println("Test 3 att");
        Attacker.setAttack(15);
        Defender.setDefense(-5);
        Defender.setHealth(15);
        expResult = -3;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        /***
         * Test 4
         */
        System.out.println("Test 4 att");
        Attacker.setAttack(15);
        Defender.setDefense(5);
        Defender.setHealth(-5);
        expResult = -2;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        System.out.println("Test 5 att");
        Attacker.setAttack(-5);
        Defender.setDefense(-5);
        Defender.setHealth(-5);
        expResult = -1;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        System.out.println("Test 6 att");
        Attacker.setAttack(30);
        Defender.setDefense(25);
        Defender.setHealth(1);
        expResult = 0;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        System.out.println("Test 7 att");
        Attacker.setAttack(100);
        Defender.setDefense(1);
        Defender.setHealth(100);
        expResult = 1;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        System.out.println("Test 8 att");
        Attacker.setAttack(25);
        Defender.setDefense(50);
        Defender.setHealth(100);
        expResult = 100;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
        
        System.out.println("Test 9 att");
        Attacker.setAttack(20);
        Defender.setDefense(10);
        Defender.setHealth(20);
        expResult = 10;
        result = instance.attack(Attacker, Defender);
        assertEquals(expResult, result);
    }

    /**
     * Test of expGain method, of class BattleControl.
     */
    @Test
    public void testExpGain() {
        System.out.println("Test 1 exp");
        Character Player = new Character();
        Character BadGuy = new Character();
        BattleControl instance = new BattleControl();
        Player.setLevel(1);
        Player.setExp(0);
        BadGuy.setExp(10);
        
        int expResult = 2;
        int result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        
        System.out.println("Test 2 exp");
        Player.setExp(30);
        BadGuy.setExp(-5);
        expResult = -2;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        System.out.println("Test 3 exp");
        Player.setExp(-5);
        BadGuy.setExp(10);
        expResult = -1;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        System.out.println("Test 4 exp");
        Player.setExp(1);
        BadGuy.setExp(0);
        expResult = -2;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        System.out.println("Test 5 exp");
        Player.setExp(-5);
        BadGuy.setExp(-5);
        expResult = -1;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        System.out.println("Test 6 exp");
        Player.setExp(100);
        BadGuy.setExp(5);
        expResult = 11;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        System.out.println("Test 7 exp");
        Player.setExp(0);
        BadGuy.setExp(50);
        expResult = 6;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
        System.out.println("Test 8 exp");
        Player.setExp(0);
        BadGuy.setExp(5);
        expResult = 1;
        result = instance.expGain(Player, BadGuy);
        assertEquals(expResult, result);
        
    }
    

    
}
