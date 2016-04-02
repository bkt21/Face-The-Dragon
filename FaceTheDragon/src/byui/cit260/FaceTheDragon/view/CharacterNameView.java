/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import byui.cit260.FaceTheDragon.model.Game;
import facethedragon.FaceTheDragon;
import byui.cit260.FaceTheDragon.model.Character;

/**
 *
 * @author Murray
 */
public class CharacterNameView extends View{
    
    private String promptMessage;

    public CharacterNameView() {
        super("\nPlease enter your Characters name: ");
    }

    @Override
    public boolean doAction(String choice) {

        Game game = FaceTheDragon.getCurrentGame();
        Character character = game.getCharacter();
        
        character.setName(choice);

        return true;
    }

    
}
