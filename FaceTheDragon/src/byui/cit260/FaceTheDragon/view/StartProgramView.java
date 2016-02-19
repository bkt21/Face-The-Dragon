/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

/**
 *
 * @author Murray
 */
public class StartProgramView {

    public static void displayStartProgramView() {
        System.out.println("\n***displayStartProgram function was called***");
    }
    private String promptMessage;
    
    public StartProgramView() {
       this.promptMessage = "\nPlease enter your name: ";
       //show the banner once the view is created
       this.displayBanner();
       
    }

    private void displayBanner() {
        System.out.println(
        "Welcome to Face The Dragon!"
        );
    }
}
