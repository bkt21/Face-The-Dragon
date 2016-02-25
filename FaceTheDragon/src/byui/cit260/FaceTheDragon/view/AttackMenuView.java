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
            
            done = this.doAction(menuOption,Attacker,Defender);
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

    private boolean doAction(String choice, Character Attacker, Character Defender) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "A":
                this.attack(Attacker,Defender);
                break;
            case "U":
                this.usePotion(Attacker);
                break;
            case "R":
                 this.tryToRun(Attacker,Defender);
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void attack(Character Attacker, Character Defender) {
        System.out.println("\n attack() was called*** ");
    }

    private void usePotion(Character Attacker) {
        System.out.println("\n usePotion() was called*** ");
    }

    private void tryToRun(Character Attacker, Character Defender) {
        if(Attacker.getLevel() > Defender.getLevel()){
                    double rand = Math.random();
                    if(rand > .25){
                        System.out.println(rand);
                        return;
                    }
                }
                else{
                        double random = Math.random();
                        if(random > .75){
                            System.out.println(random);
                            return;
                        }
                    }
                }
 }
