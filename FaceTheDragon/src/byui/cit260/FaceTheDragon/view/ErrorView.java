/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

import facethedragon.FaceTheDragon;
import java.io.PrintWriter;

/**
 *
 * @author Murray
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = FaceTheDragon.getOutFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
        "------------------------------"
        + "\n- Error - " + errorMessage
        + "\n----------------------------");
    }
    
}
