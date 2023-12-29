
package project.commands;

import java.util.ArrayList;
import project.model.Character;
import project.model.SuperHV;


public class AddCharacter {
    public static void addCharacter(String[] line, ArrayList<Character> characters) {
        System.out.println("Command: ADDCHARACTER");
        if(line[1].equals("superhv"))
        {
            //if the charcters is a super hero we create the character
            // and add his superpowers
            SuperHV c = new SuperHV(line[2], line[3], line[4], line[5], Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8]), Integer.parseInt(line[9]), Integer.parseInt(line[10]));
            characters.add(c);
            //loop until we have no more strings and add them in the power list of the SuperHV class
            for(int i = 11; i< line.length; i++)
                c.addPower(line[i]);
            System.out.println(c);
        }
        else
        {
            //creating a new character and adding it to the list
            Character c = new Character(line[1], line[2], line[3], line[4], Integer.parseInt(line[5]), Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8]), Integer.parseInt(line[9]));
            characters.add(c);
            System.out.println(c);
        }
        System.out.println("");
    }
}
