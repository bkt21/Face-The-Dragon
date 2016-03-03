/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import java.util.Scanner;
import byui.cit260.FaceTheDragon.model.Armor;
import byui.cit260.FaceTheDragon.model.Weapons;
import byui.cit260.FaceTheDragon.model.Resources;

/**
 *
 * @author Brittany
 */
public class ItemMenuView extends View {
    
    

    public ItemMenuView() {
        super("\n----------------------------------"
                  + "\n| Item Menu                      |"
                  + "\n----------------------------------"
                  + "\nV - View Items"
                  + "\nU - Use Items"
                  + "\nE - Equip Items"
                  + "\nQ - Quit"
                  + "\n----------------------------------");
    }
        @Override
        public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "V":
                this.viewItems();
                break;
            case "U":
                this.useItems();
                break;
            case "E":
                this.equipItems();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void viewItems() {
        
        Armor basicArmor = new Armor();
        Armor intermediateArmor = new Armor();
        Armor advancedArmor = new Armor();
        Weapons basicSword = new Weapons();
        Weapons goldenSword = new Weapons();
        Resources redPotion = new Resources();
        Resources bluePotion = new Resources();
        
        this.menu = "\\n----------------------------------\"\n" 
                  + "\\n| Item Stock                      |\"\n" 
                  + "\\n----------------------------------\"\n" 
                  + "\\n--- Armor ---\"\n" 
                  + "\\nBasic Armor - " + basicArmor.getQuantity() + "/n"
                  + "\\nIntermediate Armor - " + intermediateArmor.getQuantity() + "\n" 
                  + "\\nAdvanced Armor - " + advancedArmor.getQuantity() +"\n" 
                  + "\\n--- Weapons ---\"\n"
                  + "\\nBasic Sword - " + basicSword.getQuantity() + "\n" 
                  + "\\nGolden Sword - " + goldenSword.getQuantity() +"\n" 
                  + "\\n--- Potions ---\"\n"
                  + "\\nRed Potion - " + redPotion.getQuantity() + "\n" 
                  + "\\nBlue Potion - " + bluePotion.getQuantity() +"\n" 
                  + "\\n----------------------------------\"\n";
    }

    private void useItems() {
       UseItemView itemView = new UseItemView();
       itemView.displayItemMenuView();
    }

    private void equipItems() {
        System.out.println("\nequipItems was called");
    }

}
