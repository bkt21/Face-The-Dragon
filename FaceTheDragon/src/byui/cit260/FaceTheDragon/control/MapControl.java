/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Map;
import byui.cit260.FaceTheDragon.model.Scene;

/**
 *
 * @author Murray
 */
class MapControl {

    static Map createMap() {
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScene();
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveCharacterToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
