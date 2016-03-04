/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FaceTheDragon.view;

/**
 *
 * @author Murray
 */
public class StoryView extends View{
    
    public StoryView() {
        super("\n----------------------------------"
                + "\n| Story                    |"
                + "\n----------------------------------"
                + "\n"
                + "\n----------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "M":
                this.moreInfo();
                break;
            case "P":
                this.Pictures();
                break;
            default:
                System.out.println("\n*** Invalid Selection**** Try Again");
                break;
        }
        return false;
    }

    private void moreInfo() {
        System.out.println("\n*** moreInfo called****");
    }

    private void Pictures() {
        System.out.println("\n*** Pictures called****");
    }
}
