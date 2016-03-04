/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import java.util.Scanner;

/**
 *
 * @author Brittany
 */
public class MapView extends View {
    
    private String promptMessage;

    public MapView() {
        super("\n----------------------------------------------"
                + "\n|                  Game Map                  |"
                + "\n----------------------------------------------"
                + "\n|--------|--------|--------|--------|--------|"
                + "\n|  Farm  | Forest |  Lake  | Forest |  Cave  |"
                + "\n|--------|--------|--------|--------|--------|"
                + "\n|   GW   | Forest |  Lake  |  Lake  |  Cave  |"
                + "\n|--------|--------|--------|--------|--------|"
                + "\n| Forest | Forest |   GH   | Forest | Forest |"
                + "\n|--------|--------|--------|--------|--------|"
                + "\n|  Pond  |   OS   | Forest |  Lake  | Forest |"
                + "\n|--------|--------|--------|--------|--------|"
                + "\n| Forest | Forest |   AB   | Forest | Dragon |"
                + "\n|--------|--------|--------|--------|--------|"
                + "\n Key:"
                + "\n GW - Good Wizard                   N"
                + "\n GH - Goblin Hut                 W -+- E "
                + "\n OS - Oger Swamp                    S"
                + "\n AB - Abandoned Building"
                + "\n----------------------------------------------");
}
    
     void displayItemMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }

        return value;
    }

    @Override
    public boolean doAction(String choice) {
        this.promptMessage = "\n Which direction do you want to go?";
        
        choice = choice.toUpperCase();

        switch (choice) {
            case "N":
            case "NORTH":
                this.moveNorth();
                break;
            case "S":
            case "SOUTH":
                this.moveSouth();
                break;
            case "E":
            case "EAST":
                this.moveEast();
                break;
            case "W":
            case "WEST":
                this.moveWest();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void moveNorth() {
        System.out.println("\n***move North was called***");
    }

    private void moveSouth() {
       System.out.println("\n***move South was called***");
    }

    private void moveEast() {
        System.out.println("\n***move East was called***");
    }

    private void moveWest() {
        System.out.println("\n***move West was called***");
    }
    
}
