/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.control.GameControl;
import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.InventoryItem;
import byui.cit260.FaceTheDragon.model.Character;
import byui.cit260.FaceTheDragon.model.Location;
import byui.cit260.FaceTheDragon.model.Map;
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
                  + "\nC - Character Info"
                  + "\nH - Help"
                  + "\nS - Save Game"
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
                //this.move();
                break;
            case 'C':
                this.characterInfo();
                break;
            case 'H':
                this.displayHelp();
                break;
            case 'S':
                //this.saveGame();
                break;
            default:
                this.console.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = FaceTheDragon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        this.console.println("\n       LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                      ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"QUANTITY IN STOCK");
        this.console.println(line.toString());
        
        for(InventoryItem item : inventory) {
            line = new StringBuilder("                                      ");
            line.insert(0, item.getDescription());
            line.insert(28, item.getQuantityInStock());
            
            this.console.println(line.toString());
        }
    }

    private void displayMap() {
        StringBuilder line;
       
        Game game = FaceTheDragon.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        
        this.console.println("\n          Map of Naynayheyhey\n");
        line = new StringBuilder("                                      ");
        line.insert(0,"1");
        line.insert(10,"2");
        line.insert(20,"3");
        line.insert(30,"4");
        line.insert(40,"5");
        this.console.println(line.toString());
        
        String total = null;
        for (int i = 0; i < 5; i++) {
            total = null;
            this.console.println("------------------------------------------\n|");
            for (int j = 0; j < 5; j++){

               if (locations[i][j].isVisited()){
                   total += locations[i][j].getMapSymbol();
                   //mapLine.insert(0,locations[i][j].getMapSymbol());
               }
               else{
                   total += "  ??  ";
               }
//this.console.println(mapLine.toString());
            }
            total += "|\n";
        this.console.println(total);
        }
        

    }

    private void characterInfo() {
        Game game = FaceTheDragon.getCurrentGame();
        Character character = game.getCharacter();
        
        this.console.println("\n\nYour Character info is: " 
                            + "\nName: " + character.getName()
                            + "\nLevel: " + character.getLevel()
                            + "\nAttack: " + character.getAttack() 
                            + "\nDefense: " + character.getDefense()
                            + "\nGold: " + character.getGold()
                            + "\nHealth: " + character.getHealth() + "/" + character.getMaxHealth()
                            + "\nExperience: " + character.getExp());
    }

    private void displayHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}

