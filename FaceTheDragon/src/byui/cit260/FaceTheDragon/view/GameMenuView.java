/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.InventoryItem;
import byui.cit260.FaceTheDragon.model.Character;
import byui.cit260.FaceTheDragon.model.Location;
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
            case 'C':
                this.characterInfo();
                break;
            case 'H':
                this.displayHelp();
                break;
            case 'Q':
                this.saveGame();
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
            line.insert(23, item.getQuantityInStock());
            
            this.console.println(line.toString());
        }
    }

    private long displayMap() {
        StringBuilder line;
       
        Game game = FaceTheDragon.getCurrentGame();
        MapControl[] map = game.getMap();
        Location[][] locations = map.getLocations();
        
        long total = 0;
        for (int i = 0; i < 5; i++) {
            this.console.println("|--------");
            for (int j = 0; j < 5; j++){
                this.console.println("|");
                total += locations[i][j];

               if (locations[i][j].isVisited()){
                   this.console.println(locations[i][j].getMapSymbol());

               if (locations[i][j].isVisited() != false){
                   this.console.println(locations[i][j].getMapSymbol());

               } 
               else{
                   this.console.println("  ??  ");
               }
               this.console.println("|");
            }
        }
        return total;
    }

    private void characterInfo() {
        Game game = FaceTheDragon.getCurrentGame();
        Character character = game.getCharacter();
        
        this.console.println("Your Character info is: " 
                            + "\nName: " + character.getName()
                            + "\nAttack: " + character.getAttack() 
                            + "\nDefense: " + character.getDefense()
                            + "\nLevel: " + character.getLevel()
                            + "\nGold: " + character.getGold()
                            + "\nHealth: " + character.getHealth() + " out of " + character.getMaxHealth()
                            + "\nExperience: " + character.getExp());
    }

}

