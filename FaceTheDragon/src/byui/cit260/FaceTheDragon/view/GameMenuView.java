/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.InventoryItem;
import facethedragon.FaceTheDragon;

/**
 *
 * @author Murray
 */
class GameMenuView extends View {

    public GameMenuView() {
        super("\n----------------------------------"
                  + "\n| Face The Dragon                |"
                  + "\n----------------------------------"
                  + "\nV - View Map"
                  + "\nI - View List of Items in Inventory"
                  + "\nM - Move"
                  + "\nH - Help"
                  + "\nQ - Quit"
                  + "\n----------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'M':
                this.move();
                break;
            case 'H':
                this.displayHelp();
                break;
            case 'Q':
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }
        
  public void displayMenu() {
        System.out.println("\n***displayMenu was called****");
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = FaceTheDragon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n       LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                      ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"QUANTITY IN STOCK");
        System.out.println(line.toString());
        
        for(InventoryItem item : inventory) {
            line = new StringBuilder("                                      ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getQuantityInStock());
            
            System.out.println(line.toString());
        }
    }

    private void displayMap() {
        System.out.println("Yo we stil gots ta do this...");
        /*
BEGIN
 get the map locations from the current game
 DISPLAY title
 DISPLAY row of column numbers
 FOR every row in map
 DISPLAY row divider
 DISPLAY row number
 FOR every column in row
 DISPLAY column divider
 location = locations[row][column]
 IF location has been visited
 DISPLAY the map symbol for location
 ELSE
 DISPLAY " ?? "
 ENDIF
 DISPLAY ending column divider
 ENDFOR
 DISPLAY ending row divider
END
        */
    }

}

