/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.InventoryItem;
import byui.cit260.FaceTheDragon.model.Character;
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

    private long displayMap(int[][] mapLocations ) {
        StringBuilder line;
        
        Game game = FaceTheDragon.getCurrentGame();
        MapControl[] map = game.getMap();
        
        long total = 0;
        for (int i = 0; i < mapLocations.length; i++) {
            for (int j = 0; j < mapLocations[i].length; j++){
                total += mapLocations[i][j];
            }
        }
        return total;
    }

    private void characterInfo(Character character) {
        System.out.println("Your Character info is: " 
                            + "\nName: " + character.getName()
                            + "\nAttack: " + character.getAttack() 
                            + "\nDefense: " + character.getDefense()
                            + "\nLevel: " + character.getLevel()
                            + "\nGold: " + character.getGold()
                            + "\nHealth: " + character.getHealth() + " out of " + character.getMaxHealth()
                            + "\nExperience: " + character.getExp()
        );
    }

}

