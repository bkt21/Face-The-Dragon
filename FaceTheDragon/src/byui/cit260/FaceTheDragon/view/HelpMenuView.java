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
                  + "\nG - Goal of the Game"
                  + "\nM - How to Move"
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
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        System.out.println("\n The Goal of this game is blah blah blah blah...");
    }

    private void howToMove() {
        System.out.println("\n To move you need to do it...stop being lame...");    }
}
