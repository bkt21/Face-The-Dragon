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
 * @author Murray
 */
public class Map implements Serializable{
    
    private int rowCount;
    private int columnCount;
    
    //Default Constructor
    public Map() {
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
    
   
}
