/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.Map;
import byui.cit260.FaceTheDragon.model.Player;
import byui.cit260.FaceTheDragon.model.InventoryItem;
import facethedragon.FaceTheDragon;

/**
 *
 * @author Murray
 */
public class GameControl {
    
    private Player player;
    private InventoryItem[] inventory;
    private Map map;

    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        FaceTheDragon.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        FaceTheDragon.setCurrentGame(game);
                
        game.setPlayer(player); //save player in game
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveCharacterToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList(){
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem redPotion = new InventoryItem();
        redPotion.setDescription("A magical Potion that can heal you");
        redPotion.setQuantityInStock(0);
        inventory[0] = redPotion;
        
        InventoryItem bluePotion = new InventoryItem();
        bluePotion.setDescription("A magical Potion that can greatly heal you");
        bluePotion.setQuantityInStock(0);
        inventory[0] = bluePotion;
        
        InventoryItem keys = new InventoryItem();
        keys.setDescription("A way to open up locked doors");
        keys.setQuantityInStock(0);
        inventory[0] = keys;
        
        InventoryItem greenPotion = new InventoryItem();
        greenPotion.setDescription("A magical Potion that can increase your max health");
        greenPotion.setQuantityInStock(0);
        inventory[0] = greenPotion;
        
        InventoryItem bloodPotion = new InventoryItem();
        bloodPotion.setDescription("A magical Potion that can increase your attack");
        bloodPotion.setQuantityInStock(0);
        inventory[0] = bloodPotion;
        
        
        
        return inventory;
    }
}
