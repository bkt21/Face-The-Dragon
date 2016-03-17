/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.model;

import byui.cit260.FaceTheDragon.control.GameControl;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Murray
 */
public class Map implements Serializable{
    
    private int rowCount;
    private int columnCount;
    private Location[][] = locations;
    
    //Default Constructor
    public Map() {
    }
    
    public Map createMap() {
        Map map = new Map();
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map,scenes);
        
        return map;
    }

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Getters and Setters

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.rowCount;
        hash = 19 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    // toString
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    } 

    private Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
