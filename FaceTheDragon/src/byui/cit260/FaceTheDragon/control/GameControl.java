/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.Map;
import byui.cit260.FaceTheDragon.model.Player;
import byui.cit260.FaceTheDragon.model.Character;
import byui.cit260.FaceTheDragon.model.InventoryItem;
import byui.cit260.FaceTheDragon.model.Location;
import byui.cit260.FaceTheDragon.model.Scene;
import facethedragon.FaceTheDragon;

/**
 *
 * @author Murray
 */
public class GameControl {

    private Player player;
    private Character character;
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
        
        Character character = new Character();
        game.setCharacter(character);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        //MapControl.moveCharacterToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList(){
        InventoryItem[] inventory = new InventoryItem[6];
        
        InventoryItem redPotion = new InventoryItem();
        redPotion.setDescription("Red Potion");
        redPotion.setQuantityInStock(0);
        inventory[items.redPotion.ordinal()] = redPotion;
        
        InventoryItem bluePotion = new InventoryItem();
        bluePotion.setDescription("Blue Potion");
        bluePotion.setQuantityInStock(0);
        inventory[items.bluePotion.ordinal()] = bluePotion;
        
        InventoryItem keys = new InventoryItem();
        keys.setDescription("Keys");
        keys.setQuantityInStock(0);
        inventory[items.keys.ordinal()] = keys;
        
        InventoryItem greenPotion = new InventoryItem();
        greenPotion.setDescription("Green Potion");
        greenPotion.setQuantityInStock(0);
        inventory[items.greenPotion.ordinal()] = greenPotion;
        
        InventoryItem bloodPotion = new InventoryItem();
        bloodPotion.setDescription("Blood Potion");
        bloodPotion.setQuantityInStock(0);
        inventory[items.bloodPotion.ordinal()] = bloodPotion;
        
        InventoryItem gold = new InventoryItem();
        gold.setDescription("Gold");
        gold.setQuantityInStock(0);
        inventory[items.gold.ordinal()] = gold;
        
        return inventory;
    }
    
    public enum items {
        redPotion,
        bluePotion,
        keys,
        greenPotion,
        bloodPotion,
        gold;
    }
}
