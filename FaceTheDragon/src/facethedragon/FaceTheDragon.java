/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facethedragon;

import byui.cit260.FaceTheDragon.model.Player;

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
    }
    
}
