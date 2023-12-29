
package project.commands;

import java.util.ArrayList;
import project.model.Character;
import project.model.SuperHV;

public class AddPower {
    public static void addPower(String[] line, ArrayList<Character> characters){
        System.out.println("Command: ADDPOWER");
        if(characters.isEmpty())
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //creating a found boolean varibale which turns true when and if the charcater is found
            boolean found = false;
            //also create a character to save the searched charcacter in
            SuperHV c = new SuperHV();
            //loop through the character listy and change the found if the charcater is found and save it in c
            for(int i = 0; i< characters.size(); i++)
                if(line[1].equals(characters.get(i).getName()))
                {
                    found = true;
                    c = (SuperHV) characters.get(i);
                }
            //if the character was found print it's details
            if(found == true)
            {
                //create a haspower bool variable to know if the character already has the superpower
                boolean hasPower = false;
                //if found search if he has the superpower
                for(int i = 0; i< c.getPowerSize();i++)
                    if(c.getPower(i).equals(line[2]))
                        hasPower = true;
                if(hasPower == true)
                    //if they alreayd have the charcacter print the message
                    System.out.printf("   ERROR: %s already has the superpower of %s.\n\n",line[1], line[2]);
                else
                {
                    //if the superpower is not already there, add it to the character and print the message
                    c.addPower(line[2]);
                    System.out.printf("   %s now has the new superpower of %s.\n\n", line[1], line[2]);
                }
            }
            else
                //if not print no found message
                System.out.printf("   ERROR: %s is not a character currently in the system.\n\n", line[1]);
        }
    }
}
