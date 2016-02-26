/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Resources;
import byui.cit260.FaceTheDragon.model.Player;
import byui.cit260.FaceTheDragon.control.PlayerControl;
import byui.cit260.FaceTheDragon.model.Character;
import java.util.Scanner;

/**
 *
 * @author Brittany
 */
public class UseItemView {

    private String promptMessage;
    private Resources redPotion = new Resources();
    private Resources bluePotion = new Resources();

    public UseItemView() {
        this.redPotion.setIncreaseHealth(5);
        this.bluePotion.setIncreaseHealth(10);
        this.bluePotion.setQuantity(2);
        this.redPotion.setQuantity(4);
        this.promptMessage = "\n----------------------------------"
                + "\n| Potion Inventory                      |"
                + "\n Potions are used to heal you."
                + "\n----------------------------------"
                + "\nR - Use Red Potion - " + redPotion.getQuantity() + "\n"
                + "\nB - Use Blue Potion - " + bluePotion.getQuantity() + "\n"
                + "\nQ - Quit"
                + "\n----------------------------------";

    }

    void displayItemMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);
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

    //menu do action
    private boolean doAction(String choice) {

        choice = choice.toUpperCase();
        Character player = new Character();
        player.setMaxHealth(100);
        player.setHealth(20);
        Resources potionSelected = null;
        

        switch (choice) {

            case "R":
                potionSelected = this.redPotion;

                break;
            case "B":
                potionSelected = this.bluePotion;

                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                return false;
        }
        
        // set promptmessage and call get input
        this.promptMessage = "\n How many potions do you want to use? ";
        String potionsNumber = this.getMenuOption();
        // convert value entered into integer number
        int potionNumber = Integer.parseInt(potionsNumber);
        // call control function peform action (task)
        int result = PlayerControl.increaseHealth(this.redPotion, potionNumber, player);
        // if control function fails
        if (result == -1) {
            System.out.println("\n ");
            return true;
        } else if (result == -2) {
            System.out.println("\n ");
            return true;
        } else if (result == -3) {
            System.out.println("\n ");
            return true;
        }

        System.out.println("\n Your new health is: " + result);
        return true;
    }

}
