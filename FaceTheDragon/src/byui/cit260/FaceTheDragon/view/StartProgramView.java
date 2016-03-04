/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.control.GameControl;
import byui.cit260.FaceTheDragon.model.Player;
import java.util.Scanner;

/**
 *
 * @author Murray
 */
public class StartProgramView extends View{
    
    @Override
    public boolean doAction(String playersName){
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }
    
    private String promptMessage;
    
    public StartProgramView() {
       super("\nPlease enter your name: ");
       //show the banner once the view is created
       this.displayBanner();
       
    }

    private void displayBanner() {
        System.out.println(
"                      ,-,-      \n" +
"                     / / |      \n" +
"   ,-'             _/ / /       \n" +
"  (-_          _,-' `Z_/        \n" +
"   \"#:      ,-'_,-.    \\  _     \n" +
"    #'    _(_-'_()\\     \\\" |    \n" +
"  ,--_,--'                 |    \n" +
" / \"\"                      L-'\\ \n" +
" \\,--^---v--v-._        /   \\ | \n" +
"   \\_________________,-'      | \n" +
"                    \\           \n" +
"      Welcome        \\          \n" +
" to Face The Dragon!  \\         \n"
        );
    }

    private void displayNextView(Player player) {
        System.out.println("\n================================================"
                         + "\nWelcome to Face The Dragon " + player.getName() + "!"
                         + "\nGood Luck and have fun!"
                         + "\n================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
}
