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
public class Character implements Serializable{
   
   private String name; 
   private String description;
   private String attack; 
   private String defense;
   private Double level;
   private Double gold;
   private Double maxHealth;
   private Double health;

    public Character() {
   
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

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(Double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
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
        return true;
    }
    
    //to string

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", attack=" + attack + ", defense=" + defense + ", level=" + level + ", gold=" + gold + ", maxHealth=" + maxHealth + ", health=" + health + '}';
    }
    
    
   
   
}
