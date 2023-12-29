
package project.commands;

import java.util.ArrayList;
import project.model.Character;

public class SearchCharacter {
    public static void searchCharcater(String[] line, ArrayList<Character> characters){
        System.out.println("Command: SEARCHCHARACTER");
        if(characters.isEmpty())
            //if the list is empty print the message
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //creating a found boolean varibale which turns true when and if the charcater is found
            boolean found = false;
            //also create a character to save the searched charcacter in
            Character c = new Character();
            //loop through the character listy and change the found if the charcater is found and save it in c
            for(int i = 0; i< characters.size(); i++)
                if(line[1].equals(characters.get(i).getName()))
                {
                    found = true;
                    c = characters.get(i);
                }
            //if the character was found print it's details
            if(found == true)
            {
                System.out.println(c);
                System.out.println("");
            }
            else
                //if not print no found message
                System.out.printf("   ERROR: %s is not a character currently in the system.\n\n", line[1]);
        }
    }
}
