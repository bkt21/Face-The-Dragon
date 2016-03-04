/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

/**
 *
 * @author Brittany
 */
public class MapView extends View {

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
                + "\n GW - Good Wizard"
                + "\n GH - Goblin Hut"
                + "\n OS - Oger Swamp"
                + "\n AB - Abandoned Building"
                + "\n----------------------------------------------");
}
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
