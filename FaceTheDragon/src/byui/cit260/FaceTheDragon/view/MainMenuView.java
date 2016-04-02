    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.control.GameControl;
import byui.cit260.FaceTheDragon.model.Character;
import facethedragon.FaceTheDragon;
import java.util.Scanner;

/**
 *
 * @author Murray
 */
public class MainMenuView extends View{

    public MainMenuView() {
        super("\n----------------------------------"
                  + "\n| Main Menu                      |"
                  + "\n----------------------------------"
                  + "\nN - New Game"
                  + "\nL - Load Game"
                  + "\nH - Help on how to play the game"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n----------------------------------");
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
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

    private void startNewGame() {
        GameControl.createNewGame(FaceTheDragon.getPlayer());
        
        CharacterNameView cN = new CharacterNameView();
        cN.display();
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void loadGame() {
        this.console.println("\nloadGame was called");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        this.console.println("\nsaveGame was called");
    }
    
}
