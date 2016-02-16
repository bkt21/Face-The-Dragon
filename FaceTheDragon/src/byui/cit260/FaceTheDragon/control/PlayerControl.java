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
    public int increaseHealth(Resources potion, int potionToUse, Character health){
            
            int newHealth; 
            
            if(potionInventory <= 0)then 
            return -1

            if(potionsToUse > potionInventory)then
            return -2

            if(currentHealth >= 100 & currentHealth<= 0)then
            return -3

            if(potionsToUse * 10 + currentHealth >= 100)then
            return -4

            
            
    }
            
}
