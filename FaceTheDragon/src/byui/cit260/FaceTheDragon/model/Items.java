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
public class Items implements Serializable{
    
    private String type;
    private Double quantity;
    private Double goldAmount;
    
    public Items() {
    
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(Double goldAmount) {
        this.goldAmount = goldAmount;
    }
    
    //hashCodes and equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.quantity);
        hash = 97 * hash + Objects.hashCode(this.goldAmount);
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
        final Items other = (Items) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.goldAmount, other.goldAmount)) {
            return false;
        }
        return true;
    }
    
    //to strings

    @Override
    public String toString() {
        return "Items{" + "type=" + type + ", quantity=" + quantity + ", goldAmount=" + goldAmount + '}';
    }
    
}
