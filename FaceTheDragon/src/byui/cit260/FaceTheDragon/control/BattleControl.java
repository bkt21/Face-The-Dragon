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

        double max = (Attacker.getAttack() + (Attacker.getAttack()*.2));
        double min = (Attacker.getAttack() - (Attacker.getAttack()*.2));
        double firstAttackerInitialDamage = Math.floor(Math.random() * (max - min)) + min;
        int attackerInitialDamage = (int) (firstAttackerInitialDamage);
                
        damageDealt = attackerInitialDamage - Defender.getDefense();
        if(damageDealt < 0){
            damageDealt = 0;
        }
        
        newHealth = Defender.getHealth() - damageDealt;
        
        if(newHealth < 0){
            newHealth = 0;
        }
        Defender.setHealth(newHealth);
return Defender.getHealth();
    }
    
    public int expGain(Character Player, Character BadGuy){
    
        
        if (Player.getExp() < 0) {
            return -1;
        }
        if (BadGuy.getExp() < 1) {
            return -2;
        }
        
        int newExp = Player.getExp() + BadGuy.getExp();
        Player.setExp(newExp);
        
        int i = 0;
        
        while (i < 12){
            if(Player.getExp() < (i * 10)){
            Player.setLevel(i);
            break;
            }
            i++;
        }

        return Player.getLevel();
    }
}
