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
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
        Character Attacker = new Character();
        Character Defender = new Character();
        Attacker.setLevel(5);
        Defender.setLevel(100);
        AttackMenuView menu = new AttackMenuView();
        menu.displayAttackMenuView(Attacker, Defender);
    }

    private void loadGame() {
        System.out.println("\nloadGame was called");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("\nsaveGame was called");
    }
    
}
