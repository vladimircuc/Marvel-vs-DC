
package project.commands;

import java.util.ArrayList;
import project.model.Character;

public class DisplayHeroes {
    public static void displayHeroes( ArrayList<Character> characters)
    {
        System.out.println("Command: DISPLAYHEROES");
        if(characters.isEmpty())
            //if there are no characters print error message
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //if there are check to see if there are heroes 
            // isFound will tell us if there are or not after we loop the arraylist and check
            boolean isFound = false;
            for(int i = 0; i< characters.size(); i++)
                if(characters.get(i).getTeam().equals("Heroes"))
                    isFound = true;
            //if there are heroes print them
            if(isFound == true)
                for(int i = 0; i< characters.size(); i++)
                {
                    //loop again
                    if(characters.get(i).getTeam().equals("Heroes"))
                    {
                        //of it's a hero print it's details
                        System.out.println("   -----------------------------------------");
                        System.out.println(characters.get(i));
                        System.out.println("");
                    } 
                }
            else
                //if there are no heroes print error message
                System.out.println("   ERROR: cannot execute command. There are no heroes currently in the system.\n");
        }
    }
}
