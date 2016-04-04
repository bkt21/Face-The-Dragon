/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brittany
 */
public class Character implements Serializable{
   
   private String name; 
   private String description;
   private int attack; 
   private int defense;
   private int level;
   private int gold;
   private int maxHealth;
   private int health;
   private int exp;
   private Point coordinates;
   
   

    public Character() {
        this.name = null;
        this.description = "";
        this.attack = 10;
        this.defense = 5;
        this.level = 1;
        this.gold = 10;
        this.maxHealth = 10;
        this.health = 10;
        this.exp = 0;
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
    
    
    
    //hashCode and equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.attack);
        hash = 29 * hash + Objects.hashCode(this.defense);
        hash = 29 * hash + Objects.hashCode(this.level);
        hash = 29 * hash + Objects.hashCode(this.gold);
        hash = 29 * hash + Objects.hashCode(this.maxHealth);
        hash = 29 * hash + Objects.hashCode(this.health);
        hash = 29 * hash + Objects.hashCode(this.exp);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.attack, other.attack)) {
            return false;
        }
        if (!Objects.equals(this.defense, other.defense)) {
            return false;
        }
        if (!Objects.equals(this.level, other.level)) {
            return false;
        }
        if (!Objects.equals(this.gold, other.gold)) {
            return false;
        }
        if (!Objects.equals(this.maxHealth, other.maxHealth)) {
            return false;
        }
        if (!Objects.equals(this.health, other.health)) {
            return false;
        }
        if (!Objects.equals(this.exp, other.exp)) {
            return false;
        }
        return true;
    }
    
    //to string

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", attack=" + attack + ", defense=" + defense + ", level=" + level + ", gold=" + gold + ", maxHealth=" + maxHealth + ", health=" + health + ", exp=" + exp + '}';
    }
    
    
   
   
}
