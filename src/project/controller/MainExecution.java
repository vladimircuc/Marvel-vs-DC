
package project.controller;

import project.commands.AddCharacter;
import project.commands.AddPower;
import project.commands.DisplayDC;
import project.commands.DisplayHeroes;
import project.commands.DisplayMarvel;
import project.commands.DisplayStats;
import project.commands.DisplayVillains;
import project.commands.Fight;
import project.commands.SearchCharacter;



import java.util.ArrayList;
import java.util.Scanner;

public class MainExecution {
    public static void mainExecution() {
        Scanner in = new Scanner(System.in);
        String[] line;
        ArrayList<project.model.Character> characters = new ArrayList<>();
        //create a new list of characters
        while(true){
            line = in.nextLine().split(",");
            //read the line with the command
            //depending on the command call the function corresponding 
            if(line[0].equals("ADDCHARACTER"))
                AddCharacter.addCharacter(line, characters);
            if(line[0].equals("SEARCHCHARACTER"))
                SearchCharacter.searchCharcater(line, characters);
            if(line[0].equals("ADDPOWER"))
                AddPower.addPower(line, characters);
            if(line[0].equals("FIGHT"))
                Fight.fight(line, characters);
            if(line[0].equals("DISPLAYHEROES"))
                DisplayHeroes.displayHeroes(characters);
            if(line[0].equals("DISPLAYVILLAINS"))
                DisplayVillains.displayVillains(characters);
            if(line[0].equals("DISPLAYMARVEL"))
                DisplayMarvel.displayMarvel(characters);
            if(line[0].equals("DISPLAYDC"))
                DisplayDC.displayDC(characters);
            if(line[0].equals("DISPLAYSTATS"))
                DisplayStats.DisplayStats(characters);
            if(line[0].equals("EXIT"))
            {System.out.println("Goodbye.\n");
            break;}
            //if they say QUIT exist the program 
        }
    }
}
