/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.model;

/**
 *
 * @author Murray
 */
public class Resources extends Items{
    
    private int potion;

    public Resources() {
        super();
    }
    
    //getters and setters
    public int getIncreaseHealth() {
        return potion;
    }

    public void setIncreaseHealth(int potion) {
        this.potion = potion;
    }
    
    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.potion;
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
        final Resources other = (Resources) obj;
        if (this.potion != other.potion) {
            return false;
        }
        return true;
    }
    
    //to string
    @Override
    public String toString() {
        return "Resources{" + "potion=" + potion + '}';
    }
    
}
