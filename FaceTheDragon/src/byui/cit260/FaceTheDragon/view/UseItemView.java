/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Resources;
import byui.cit260.FaceTheDragon.model.Player;
import java.util.Scanner;
/**
 *
 * @author Brittany
 */
public class UseItemView {
    
    private String menu;
    private String promptMessage;
    
    public UseItemView(Player player) {
        
        Resources redPotion = new Resources();
        Resources bluePotion = new Resources();
        
        this.menu = "\n----------------------------------"
                  + "\n| Potion Inventory                      |"
                  + "\n Potions are used to heal you."
                  + "\n----------------------------------"
                  + "\nRed Potion - " + redPotion.getQuantity() + "\n" 
                  + "\nBlue Potion - " + bluePotion.getQuantity() +"\n" 
                  + "\nQ - Quit"
                  + "\n----------------------------------";
        this.promptMessage = "\nDo you want to use a potion?";
        ;

    }
    
    void displayItemMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while(!valid){
        System.out.println("\n" + this.menu);
        value = keyboard.nextLine();
        value = value.trim();
        
        if (value.length() < 1) {
            System.out.println("\nInvalid value: value cannot be blank");
            continue;
            }
            break;
        }
        
        return value;
    }
    
    //to be done later today. 
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
       return false;
    }
    
}
