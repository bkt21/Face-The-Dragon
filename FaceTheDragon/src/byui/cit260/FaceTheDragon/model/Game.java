/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brittany
 */
public class Game implements Serializable{

    private InventoryItem[] inventory;
    private Player player;
    private Map map;
    private Character character;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Map getMap() {
        return map;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    // class instance variables
    private Double time;
    
    //Default Constuctor
    public Game() {
    }

    // getters and setters 
    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }
    
    public InventoryItem[] getInventory(){
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    
    
    //hashCode and equals 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.time);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + '}';
    }

    public void setMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
