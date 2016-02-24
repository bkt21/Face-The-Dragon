/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Character;
import java.util.Scanner;

/**
 *
 * @author Murray
 */
public class AttackMenuView {
    private String menu;

    public AttackMenuView() {
        this.menu = "\n----------------------------------"
                  + "\n| Attack Menu                     |"
                  + "\n----------------------------------"
                  + "\nA - Attack"
                  + "\nU - Use Potion"
                  + "\nR - Try to Run Away"
                  + "\n----------------------------------";
    }

    
    void displayAttackMenuView(Character Attacker, Character Defender) {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("R")){
                if(Attacker.getLevel() > Defender.getLevel()){
                    double rand = Math.random();
                    if(rand > .25){
                        return;
                    }
                }
                else{
                        double random = Math.random();
                        if(random > .75){
                            return;
                        }
                    }
                }
            
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

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "A":
                this.attack();
                break;
            case "U":
                this.usePotion();
                break;
            case "R":
                 this.tryToRun();
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void attack() {
        System.out.println("\n attack() was called*** ");
    }

    private void usePotion() {
        System.out.println("\n usePotion() was called*** ");
    }

    private void tryToRun() {
        System.out.println("\n tryToRun() was called*** ");
    }
}
