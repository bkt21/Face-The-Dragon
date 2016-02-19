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

    public void displayStartProgramView() {
        boolean done = false;
        
        do {
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
            
        }while (!done);
        
    }
    
    private String getPlayersName(){
        System.out.println("\n***getPlayersNam() was called ***");
        return "Joe";
    }
    
    private boolean doAction(String playersName){
        System.out.println("\n***doAction() was called ***");
        return true;
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
