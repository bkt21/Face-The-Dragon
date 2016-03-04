/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import java.util.Scanner;

/**
 *
 * @author Murray
 */
public class StoreMenuView extends View{

    public StoreMenuView() {
        super("\n----------------------------------"
                  + "\n| Brittany's Shop                |"
                  + "\n----------------------------------"
                  + "\nW - Buy Weapons"
                  + "\nA - Buy Aromor"
                  + "\nP - Buy Potions"
                  + "\nE - Exit Shop"
                  + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "W":
                this.shopWeapons();
                break;
            case "A":
                this.shopArmor();
                break;
            case "P":
                this.shopPotions();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void shopWeapons() {
        System.out.println("\n shopWeapons() was called ****");
    }

    private void shopArmor() {
        System.out.println("\n shopArmor() was called ****");    
    }

    private void shopPotions() {
        System.out.println("\n shopPotions() was called ****");
    }
}
