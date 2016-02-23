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
public class HelpMenuView {
    
    private String menu;

    public HelpMenuView() {
        this.menu = "\n----------------------------------"
                  + "\n| Help Menu                      |"
                  + "\n----------------------------------"
                  + "\nN - New Game"
                  + "\nL - Load Game"
                  + "\nH - Help on how to play the game"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n----------------------------------";
    }

    
    void displayHelpMenuView() {
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

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "N":
                this.startNewGame();
                break;
            case "L":
                this.loadGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }
}
