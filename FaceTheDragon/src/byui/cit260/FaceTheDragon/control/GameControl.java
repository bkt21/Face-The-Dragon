/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Player;

/**
 *
 * @author Murray
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n*** createPlayer() function was called ***");
        return new Player();
    }
    
}
