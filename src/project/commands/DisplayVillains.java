
package project.commands;

import java.util.ArrayList;
import project.model.Character;

public class DisplayVillains {
    public static void displayVillains( ArrayList<Character> characters)
    {
        System.out.println("Command: DISPLAYVILLAINS");
        if(characters.isEmpty())
            //if there are no characters print error message
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //if there are check to see if there are villains 
            // isFound will tell us if there are or not after we loop the arraylist and check
            boolean isFound = false;
            for(int i = 0; i< characters.size(); i++)
                if(characters.get(i).getTeam().equals("Villains"))
                    isFound = true;
            //if there are villains print them
            if(isFound == true)
                for(int i = 0; i< characters.size(); i++)
                {
                    //loop again
                    if(characters.get(i).getTeam().equals("Villains"))
                    {
                        //of it's a villain print it's details
                        System.out.println("   -----------------------------------------");
                        System.out.println(characters.get(i));
                        System.out.println("");
                    } 
                }
            else
                //if there are no villains print error message
                System.out.println("   ERROR: cannot execute command. There are no villains currently in the system.\n");
        }
    }
}
