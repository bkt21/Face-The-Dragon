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
public class HelpMenuView extends View{

    public HelpMenuView() {
        super("\n----------------------------------"
                  + "\n| Help Menu                      |"
                  + "\n----------------------------------"
                  + "\nG - Goal of the Game"
                  + "\nM - How to Move"
                  + "\nQ - Quit"
                  + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
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
        this.console.println("\n The Goal of this game is blah blah blah blah...");
    }

    private void howToMove() {
        this.console.println("\n To move you need to do it...stop being lame...");    }
}
