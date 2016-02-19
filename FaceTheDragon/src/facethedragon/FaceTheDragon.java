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
import byui.cit260.FaceTheDragon.model.Resources;
import byui.cit260.FaceTheDragon.model.Misc;
import byui.cit260.FaceTheDragon.view.StartProgramView;
/**
 *
 * @author Murray
 */
public class FaceTheDragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    
}
