/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Character;

/**
 *
 * @author Murray
 */
public class BattleControl {
    public int attack(Character Attacker, Character Defender){

        int newHealth;
        int damageDealt;
	
        if(Attacker.getAttack() < 1){
	return -1;
        }
        
	if(Defender.getHealth() < 1){
        return -2;
        }

        if(Defender.getDefense() < 0){
        return -3;
        }


        damageDealt = Attacker.getAttack() - Defender.getDefense();
        newHealth = Defender.getHealth() - damageDealt;
        
        Defender.setHealth(newHealth);
return Defender.getHealth();
    }
}
