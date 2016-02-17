/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Resources;
import byui.cit260.FaceTheDragon.model.Character;

/**
 *
 * @author Brittany
 */
public class PlayerControl {
    
    /* 
     * I am not sure how to bring in user input in this, would it be an action the function does? (ask for input) 
     */
    public int increaseHealth(Resources Potion, int potionsToUse, Character Player){
            
            int newHealth; 
            int healthToAdd;
            
            
            if(Potion.getQuantity() <= 0){ 
            return -1;}

            if(potionsToUse > Potion.getQuantity()){
            return -2;}

            if(Player.getHealth() >= 500 || Player.getHealth() <= 0){
            return -3;}

            if((potionsToUse * Potion.getIncreaseHealth()) + Player.getHealth() >= Player.getMaxHealth()){
            return -4;}

           healthToAdd = potionsToUse * Potion.getIncreaseHealth();
           newHealth = Player.getHealth() + healthToAdd ;


           return newHealth;
            
    }
            
}