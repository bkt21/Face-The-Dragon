/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.model;

/**
 *
 * @author Brittany
 */
public class Armor extends Items{

    private int defense;
    
    public Armor() {
        super();
    }
    
    //getter and setter

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    //hashCode and equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.defense;
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
        final Armor other = (Armor) obj;
        if (this.defense != other.defense) {
            return false;
        }
        return true;
    }
    
    // to string

    @Override
    public String toString() {
        return "Armor{" + "defense=" + defense + '}';
    }
    
    
}
