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
import byui.cit260.FaceTheDragon.view.AttackMenuView;
import byui.cit260.FaceTheDragon.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Murray
 */
public class FaceTheDragon {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static void main(String[] args) {
        
        try{
            FaceTheDragon.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            FaceTheDragon.outFile = new PrintWriter(System.out, true);
        
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        
        }catch (Throwable e) {
            System.out.println("Exception" + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                if(FaceTheDragon.inFile != null)
                    FaceTheDragon.inFile.close();
                
                if(FaceTheDragon.outFile != null)
                FaceTheDragon.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        
    }

    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FaceTheDragon.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FaceTheDragon.inFile = inFile;
    }
    
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FaceTheDragon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FaceTheDragon.player = player;
    }

}
