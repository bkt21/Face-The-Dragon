/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Murray
 */
public class Location extends Map{
    private int row;
    private int column;
    private String description;
    private Scene scene;
    private ArrayList<Character> characters;
    
    
    //default constructor

    public Location() {
        super();
    }
    
    //getters and setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    //hascode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.row;
        hash = 67 * hash + this.column;
        hash = 67 * hash + Objects.hashCode(this.description);
        return hash;
    }

    //equals
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    //tostring
    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", description=" + description + '}';
    }
    
}
