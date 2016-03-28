/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.control;

import byui.cit260.FaceTheDragon.model.Location;
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
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene farmScene = new Scene();
        farmScene.setDescription("");
        farmScene.setMapSymbol(" FA ");
        farmScene.setBlocked(false);
        scenes[SceneType.farm.ordinal()] = farmScene;
        
        Scene forestScene = new Scene();
        forestScene.setDescription("");
        forestScene.setMapSymbol(" FOR ");
        forestScene.setBlocked(false);
        scenes[SceneType.forest.ordinal()] = forestScene;
        
        Scene lakeScene = new Scene();
        lakeScene.setDescription("");
        lakeScene.setMapSymbol(" LA ");
        lakeScene.setBlocked(false);
        scenes[SceneType.lake.ordinal()] = lakeScene;
        
        Scene forest2Scene = new Scene();
        forest2Scene.setDescription("");
        forest2Scene.setMapSymbol(" FOR2 ");
        forest2Scene.setBlocked(false);
        scenes[SceneType.forest2.ordinal()] = forest2Scene;
        
        Scene caveScene = new Scene();
        caveScene.setDescription("");
        caveScene.setMapSymbol(" CA ");
        caveScene.setBlocked(false);
        scenes[SceneType.cave.ordinal()] = caveScene;
        
        Scene goodWizardScene = new Scene();
        goodWizardScene.setDescription("");
        goodWizardScene.setMapSymbol(" GW ");
        goodWizardScene.setBlocked(false);
        scenes[SceneType.goodWizard.ordinal()] = goodWizardScene;
        
        Scene forest3Scene = new Scene();
        forest3Scene.setDescription("");
        forest3Scene.setMapSymbol(" FOR3 ");
        forest3Scene.setBlocked(false);
        scenes[SceneType.forest3.ordinal()] = forest3Scene;
        
        Scene lake2Scene = new Scene();
        lake2Scene.setDescription("");
        lake2Scene.setMapSymbol(" LA2 ");
        lake2Scene.setBlocked(false);
        scenes[SceneType.lake2.ordinal()] = lake2Scene;
        
        Scene lake3Scene = new Scene();
        lake3Scene.setDescription("");
        lake3Scene.setMapSymbol(" LA3 ");
        lake3Scene.setBlocked(false);
        scenes[SceneType.lake3.ordinal()] = lake3Scene;
        
        Scene cave2Scene = new Scene();
        cave2Scene.setDescription("");
        cave2Scene.setMapSymbol(" CA2 ");
        cave2Scene.setBlocked(false);
        scenes[SceneType.cave2.ordinal()] = cave2Scene;
        
        Scene forest4Scene = new Scene();
        forest4Scene.setDescription("");
        forest4Scene.setMapSymbol(" FOR4 ");
        forest4Scene.setBlocked(false);
        scenes[SceneType.forest4.ordinal()] = forest4Scene;
        
        Scene forest5Scene = new Scene();
        forest5Scene.setDescription("");
        forest5Scene.setMapSymbol(" FOR5 ");
        forest5Scene.setBlocked(false);
        scenes[SceneType.forest5.ordinal()] = forest5Scene;
        
        Scene goblinHutScene = new Scene();
        goblinHutScene.setDescription("");
        goblinHutScene.setMapSymbol(" GH ");
        goblinHutScene.setBlocked(false);
        scenes[SceneType.goblinHut.ordinal()] = goblinHutScene;
        
        Scene forest6Scene = new Scene();
        forest6Scene.setDescription("");
        forest6Scene.setMapSymbol(" FOR6 ");
        forest6Scene.setBlocked(false);
        scenes[SceneType.forest6.ordinal()] = forest6Scene;
        
        Scene forest7Scene = new Scene();
        forest7Scene.setDescription("");
        forest7Scene.setMapSymbol(" FOR7 ");
        forest7Scene.setBlocked(false);
        scenes[SceneType.forest7.ordinal()] = forest7Scene;
        
        Scene pondScene = new Scene();
        pondScene.setDescription("");
        pondScene.setMapSymbol(" POND1 ");
        pondScene.setBlocked(false);
        scenes[SceneType.pond.ordinal()] = pondScene;
        
        Scene ogreSwampScene = new Scene();
        ogreSwampScene.setDescription("");
        ogreSwampScene.setMapSymbol(" SWAMP ");
        ogreSwampScene.setBlocked(false);
        scenes[SceneType.ogreSwamp.ordinal()] = ogreSwampScene;
        
        Scene forest8Scene = new Scene();
        forest8Scene.setDescription("");
        forest8Scene.setMapSymbol(" FOR08 ");
        forest8Scene.setBlocked(false);
        scenes[SceneType.forest8.ordinal()] = forest8Scene;
        
        Scene lake4Scene = new Scene();
        lake4Scene.setDescription("");
        lake4Scene.setMapSymbol(" LAKE4 ");
        lake4Scene.setBlocked(false);
        scenes[SceneType.lake4.ordinal()] = lake4Scene;
        
        Scene forest9Scene = new Scene();
        forest9Scene.setDescription("");
        forest9Scene.setMapSymbol(" FOR09 ");
        forest9Scene.setBlocked(false);
        scenes[SceneType.forest9.ordinal()] = forest9Scene;
        
        Scene forest10Scene = new Scene();
        forest10Scene.setDescription("");
        forest10Scene.setMapSymbol(" FOR10 ");
        forest10Scene.setBlocked(false);
        scenes[SceneType.forest10.ordinal()] = forest10Scene;
        
        Scene forest11Scene = new Scene();
        forest11Scene.setDescription("");
        forest11Scene.setMapSymbol(" FOR11 ");
        forest11Scene.setBlocked(false);
        scenes[SceneType.forest11.ordinal()] = forest11Scene;
        
        Scene abandonedBuildingScene = new Scene();
        abandonedBuildingScene.setDescription("");
        abandonedBuildingScene.setMapSymbol(" BUILD ");
        abandonedBuildingScene.setBlocked(false);
        scenes[SceneType.abandonedBuilding.ordinal()] = abandonedBuildingScene;
        
        Scene forest12Scene = new Scene();
        forest12Scene.setDescription("");
        forest12Scene.setMapSymbol(" FOR12 ");
        forest12Scene.setBlocked(false);
        scenes[SceneType.forest12.ordinal()] = forest12Scene;
        
        Scene dragonLairScene = new Scene();
        dragonLairScene.setDescription("");
        dragonLairScene.setMapSymbol(" DLAIR ");
        dragonLairScene.setBlocked(false);
        scenes[SceneType.dragonLair.ordinal()] = dragonLairScene;
        
        return scenes;
    }
    
    public enum SceneType {
        farm,
        forest,
        lake,
        forest2,
        cave,
        goodWizard,
        forest3,
        lake2,
        lake3,
        cave2,
        forest4,
        forest5,
        goblinHut,
        forest6,
        forest7,
        pond,
        ogreSwamp,
        forest8,
        lake4,
        forest9,
        forest10,
        forest11,
        abandonedBuilding,
        forest12,
        dragonLair;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.farm.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.lake.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.cave.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.goodWizard.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.lake2.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.lake3.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.cave2.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.forest5.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.goblinHut.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.forest6.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.forest7.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.pond.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.ogreSwamp.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.forest8.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.lake4.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.forest9.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.forest10.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.forest11.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.abandonedBuilding.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.forest12.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.dragonLair.ordinal()]);
    }
    
    private static int mapExplored(Map map){
        int totalScenesVisited = 0;
        int percentageVisited;
        Location[][] locations = map.getLocations();
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(locations[i][j].isVisited() != false){
                    totalScenesVisited++;
                }
            }
        }
        percentageVisited = Math.round(totalScenesVisited / 25);
        return percentageVisited;
    }
    
}
