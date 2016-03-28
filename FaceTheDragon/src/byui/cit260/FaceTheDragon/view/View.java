/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import facethedragon.FaceTheDragon;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Murray
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    protected final BufferedReader keyboard = FaceTheDragon.getInFile();
    protected final PrintWriter console = FaceTheDragon.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            this.console.println(this.displayMessage);
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        String value = null;
        boolean valid = false;
        
        try{
        while(!valid){
        System.out.println("\n" + this.displayMessage);
        value = this.keyboard.readLine();
        value = value.trim();
        
        if (value.length() < 1) {
            System.out.println("\nInvalid value: value cannot be blank");
            continue;
            }
            break;
        }
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        } 
        return value;
    }
    
    
}