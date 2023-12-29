
package project.commands;

import java.util.ArrayList;
import project.model.Character;

public class DisplayDC {
    public static void displayDC( ArrayList<Character> characters)
    {
        System.out.println("Command: DISPLAYDC");
        if(characters.isEmpty())
            //if there are no characters print error message
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //if there are check to see if there are Dc charcaters 
            // isFound will tell us if there are or not after we loop the arraylist and check
            boolean isFound = false;
            for(int i = 0; i< characters.size(); i++)
                if(characters.get(i).getUniverse().equals("DC"))
                    isFound = true;
            //if there are DC print them
            if(isFound == true)
                for(int i = 0; i< characters.size(); i++)
                {
                    //loop again
                    if(characters.get(i).getUniverse().equals("DC"))
                    {
                        //of it's a DC print it's details
                        System.out.println("   -----------------------------------------");
                        System.out.println(characters.get(i));
                        System.out.println("");
                    } 
                }
            else
                //if there are no DCs print error message
                System.out.println("   ERROR: cannot execute command. There are no DC characters currently in the system.\n");
        }
    }
}
