/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.control.BattleControl;
import byui.cit260.FaceTheDragon.model.Character;
import java.util.Scanner;

/**
 *
 * @author Murray
 */
public class AttackMenuView extends View {

    Character attacker = new Character();
    Character defender = new Character();

    public AttackMenuView() {
        super("\n----------------------------------"
                + "\n| Attack Menu                     |"
                + "\n----------------------------------"
                + "\nA - Attack"
                + "\nU - Use Potion"
                + "\nR - Try to Run Away"
                + "\n----------------------------------");
    }

    void displayAttackMenuView(Character attacker, Character defender) {
        attacker.setAttack(5);
        attacker.setDefense(10);
        attacker.setHealth(100);
        defender.setAttack(10);
        defender.setHealth(150);
        defender.setDefense(15);
        
        boolean done = false;
        do {
            this.console.println("Your Health is: " + attacker.getHealth());
            this.console.println("Your Enemy's Health is: " + defender.getHealth());
            String menuOption = this.getMenuOption();

            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        String value = "";
        boolean valid = false;

        try{
        while (!valid) {
            this.console.println("\n" + "\n----------------------------------"
                    + "\n| Attack Menu                     |"
                    + "\n----------------------------------"
                    + "\nA - Attack"
                    + "\nU - Use Potion"
                    + "\nR - Try to Run Away"
                    + "\n----------------------------------");
            value = this.keyboard.readLine();
            value = value.trim();

            if (value == "r" || value == "R") {
                break;
            } else if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value;
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "A":
                this.attack(attacker, defender);
                break;
            case "U":
                this.usePotion(attacker);
                break;
            case "R":
                if (this.tryToRun(attacker, defender) == 1) {
                    break;
                }
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void attack(Character attacker, Character defender) {
        BattleControl fight = new BattleControl();
        while (attacker.getHealth() > 0 || defender.getHealth() > 0) {

            fight.attack(attacker, defender);
        }
    }

    private void usePotion(Character attacker) {
        this.console.println("\n usePotion() was called*** ");
    }

    private int tryToRun(Character attacker, Character defender) {
        if (attacker.getLevel() > defender.getLevel()) {
            double rand = Math.random();
            if (rand > .25) {
                this.console.println(rand);
                this.console.println("You ran away!");
                return 1;
            } else {
                this.console.println("You failed to run away!");
                return 0;
            }
        } else {
            double random = Math.random();
            if (random > .75) {
                this.console.println(random);
                this.console.println("You ran away!");
                return 1;
            } else {
                this.console.println("You failed to run away!");
                return 0;
            }
        }
    }
}
