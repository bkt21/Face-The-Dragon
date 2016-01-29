/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facethedragon;

import byui.cit260.FaceTheDragon.model.Game;
import byui.cit260.FaceTheDragon.model.Player;
import byui.cit260.FaceTheDragon.model.Character;
import byui.cit260.FaceTheDragon.model.Items;
import byui.cit260.FaceTheDragon.model.Weapons;

import byui.cit260.FaceTheDragon.model.Map;
import byui.cit260.FaceTheDragon.model.Location;
import byui.cit260.FaceTheDragon.model.Armor;
/**
 *
 * @author Murray
 */
public class FaceTheDragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player1 = new Player();
        
        player1.setName("Brittan Murrpsen");
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
        
        Game game1 = new Game();
        
        game1.setTime(7.00);
        String gameTime = game1.toString();
        System.out.println(gameTime);
        
        Character character1 = new Character();
        
        character1.setName("Barry Allen");
        String characterName = character1.toString();
        System.out.println(characterName);
        
        Items item1 = new Items();
        
        item1.setGoldAmount(52);
        int amountOfGold = item1.getGoldAmount();
        System.out.println(amountOfGold);
        
        Map map1 = new Map();
        
        map1.setRowCount(5);
        int rowNumber = map1.getRowCount();
        System.out.println(rowNumber);
        
        Location farm = new Location();
        
        farm.setDescription("You are in your farm, take a break and get ready.");
        String farmIntro = farm.getDescription();
        System.out.println(farmIntro);
        
        Armor armor1 = new Armor();
        
        armor1.setDefense(9);
        int aDefense = armor1.getDefense();
        System.out.println(aDefense);
    }
    
}
