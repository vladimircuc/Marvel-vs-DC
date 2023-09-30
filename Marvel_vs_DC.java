//Name: Vladimir Cuc
//ID: 1282672
//Date: 4/6/23
//Project:


import java.util.*;
import java.io.*;

public class Marvel_vs_DC{
    
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
    
    public static void fight(String[] line, ArrayList<Character> characters){
        System.out.println("Command: FIGHT");
        if(characters.isEmpty())
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //creating 2 found boolean varibales which turns true when and if the charcaters are found
            boolean found1 = false;
            boolean found2 = false;
            //also create 2 characters to save the searched charcacters in
            Character c1 = new Character();
            Character c2 = new Character();
            
            //loop through the character listy and change the found if the charcaters are found and save them in c
            for(int i = 0; i< characters.size(); i++){
                if(line[1].equals(characters.get(i).getName()))
                {
                    found1 = true;
                    c1 = characters.get(i);
                }
                if(line[2].equals(characters.get(i).getName()))
                {
                    found2 = true;
                    c2 = characters.get(i);
                }
            }
            //if both are not found print error message for both
            if(found1 == false && found2 == false)
            {
                System.out.println("   ERROR: cannot execute command. One or more characters cannot be found.");
                System.out.printf("      %s is not a character currently in the system.\n", line[1]);
                System.out.printf("      %s is not a character currently in the system.\n\n", line[2]);
            }
            else if(found1 == false)
                System.out.printf("   ERROR: cannot execute command. One or more characters cannot be found.\n" +
                                  "      %s is not a character currently in the system.\n\n", line[1]);
            else if(found2 ==  false)
                System.out.printf("   ERROR: cannot execute command. One or more characters cannot be found.\n" +
                                  "      %s is not a character currently in the system.\n\n", line[2]);
            //if the characters were not found print the message
            else {
                //if the fighters are found print their details
                System.out.printf("   %s vs %s"+
                                "\n\n" +
                                "   Fighter #1:\n", line[1], line[2]);
                System.out.println(c1);
                System.out.println("");
                System.out.println("   Fighter #2:");
                System.out.println(c2);
                System.out.println("");
                System.out.println("   Fight Results:");
                if(c1 instanceof SuperHV && c2 instanceof SuperHV){
                    //depending what class the fighters are in choose the outcome of the battle
                    //if both are superheroes calculate their total power and see whos is mor epowerful 
                    int c1Total = c1.getIntelligence() + c1.getSkills() + c1.getSpeed() + c1.getStamina() + c1.getStrength();
                    int c2Total = c2.getIntelligence() + c2.getSkills() + c2.getSpeed() + c2.getStamina() + c2.getStrength();
                    c1Total += ((SuperHV) c1).getPowerSize() * 10;
                    c2Total += ((SuperHV) c2).getPowerSize() * 10;
                    System.out.printf("      %s's total attack power: %d\n", line[1], c1Total);
                    System.out.printf("      %s's total attack power: %d\n", line[2], c2Total);
                    //whoever has more total power is the winnner
                    String winner = (c1Total > c2Total) ? line[1] : line[2];
                    System.out.printf("      Winner: %s\n\n", winner);
                }
                else if(c1 instanceof SuperHV)
                    //if just one of them is super hero or super villain the super wins 
                    System.out.printf("      %s has no superpowers. Thus, %s wins every time.\n\n", line[2], line[1]);
                else if (c2 instanceof SuperHV)
                {
                    //if just one of them is super hero or super villain the super wins 

                    System.out.printf("      %s has no superpowers. Thus, %s wins every time.\n\n", line[1], line[2]);
                }
                else
                {
                    //if both are NPCs calculate their total power and see whos is mor epowerful 
                    int c1Total = c1.getIntelligence() + c1.getSkills() + c1.getSpeed() + c1.getStamina() + c1.getStrength();
                    int c2Total = c2.getIntelligence() + c2.getSkills() + c2.getSpeed() + c2.getStamina() + c2.getStrength();
                    System.out.printf("      %s's total attack power: %d\n", line[1], c1Total);
                    System.out.printf("      %s's total attack power: %d\n", line[2], c2Total);
                    //the one with more power wins
                    String winner = (c1Total > c2Total) ? line[1] : line[2];
                    System.out.printf("      Winner: %s\n\n", winner);
                }
                    
            }
            
        }
    }
    
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
    public static void displayMarvel( ArrayList<Character> characters)
    {
        System.out.println("Command: DISPLAYMARVEL");
        if(characters.isEmpty())
            //if there are no characters print error message
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else{
            //if there are check to see if there are marvel charcaters 
            // isFound will tell us if there are or not after we loop the arraylist and check
            boolean isFound = false;
            for(int i = 0; i< characters.size(); i++)
                if(characters.get(i).getUniverse().equals("Marvel"))
                    isFound = true;
            //if there are marvels print them
            if(isFound == true)
                for(int i = 0; i< characters.size(); i++)
                {
                    //loop again
                    if(characters.get(i).getUniverse().equals("Marvel"))
                    {
                        //of it's a marvel print it's details
                        System.out.println("   -----------------------------------------");
                        System.out.println(characters.get(i));
                        System.out.println("");
                    } 
                }
            else
                //if there are no marvels print error message
                System.out.println("   ERROR: cannot execute command. There are no Marvel characters currently in the system.\n");
        }
    }
    
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
    
    public static void DisplayStats(ArrayList<Character> characters)
    {
        System.out.println("Command: DISPLAYSTATS");
        if(characters.isEmpty())
            //if there are no characters print eroor message
            System.out.println("   ERROR: cannot execute command. There are no characters currently in the system.\n");
        else
        {
            //if there are characters start checking for Marvel charcaters 
            System.out.println("   Marvel Characters");
            //the isFound will tell us if there are Marvel characters or not
            boolean isFound = false;
            for(int i = 0; i< characters.size(); i++)
                if(characters.get(i).getUniverse().equals("Marvel"))
                    isFound = true;
            if(isFound == true)
            {
                //if there are Marvel characters chekc the heroes 
                //define variables to calculate the avrage of the heroes and villains 
                double avgInteligence = 0;
                double avgStrength = 0;
                double avgStamina = 0;
                double avgSpeed = 0;
                double avgSkills = 0;
                int nrOfNPCs = 0;
                int nrOfSP = 0;
                //create variable tp count the characters and know what to divide
                double nrMarvelDC = 0;
                //also create an arraylist of strings to save all the superpowrrs
                ArrayList<String> powers = new ArrayList<>();
                //loop through the heroes and add the values
                for(int i = 0; i< characters.size(); i++)
                {
                    //if the character is marvel and hero add his stats 
                    if(characters.get(i).getUniverse().equals("Marvel") && characters.get(i).getTeam().equals("Heroes"))
                    {
                        nrMarvelDC++;
                        //add the stats 
                        avgInteligence += characters.get(i).getIntelligence();
                        avgStrength += characters.get(i).getStrength();
                        avgStamina += characters.get(i).getStamina();
                        avgSpeed += characters.get(i).getSpeed();
                        avgSkills += characters.get(i).getSkills();
                        if(characters.get(i) instanceof SuperHV)
                        {
                            //if it's a superhero rise the number of superheroes and save the powers in the arraylist of strings
                            nrOfSP++;
                            SuperHV c = (SuperHV) characters.get(i);
                            //loop and add all the powers of the hero only if the super power is not in the list yet
                            for(int j = 0; j< c.getPowerSize(); j++)
                            {
                                String newP = c.getPower(j);
                                //isFoundPower will tell us if the power is alrady in the new arraylist
                                boolean isFoundPower = false;
                                for(int k = 0; k< powers.size(); k++)
                                    if(powers.get(k).equals(newP))
                                        isFoundPower = true;
                                if(isFoundPower ==  false)
                                    //if the power is not found in the arraylist of powers add it 
                                    powers.add(newP);
                            }
                        }
                        else
                            nrOfNPCs++;
                    }
                }
                //calculate the avrage and print them 
                avgInteligence = (double) avgInteligence / nrMarvelDC;
                avgSkills = (double) avgSkills / nrMarvelDC;
                avgSpeed = (double) avgSpeed / nrMarvelDC;
                avgStamina = (double) avgStamina / nrMarvelDC;
                avgStrength = (double) avgStrength / nrMarvelDC;
                
                System.out.printf("      Hero Stats:\n" +
                                    "         Average Intelligence: %.2f\n" +
                                    "         Average Strength:     %.2f\n" +
                                    "         Average Stamina:      %.2f\n" +
                                    "         Average Speed:        %.2f\n" +
                                    "         Average Skill:        %.2f\n" +
                                    "      Number of Normal-Person Heroes:    %d\n" +
                                    "      Number of Heroes with Superpowers: %d\n", avgInteligence, avgStrength, avgStamina, avgSpeed, avgSkills, nrOfNPCs, nrOfSP);
                if(nrOfSP > 0){
                    //if there are super people print their powers
                    System.out.print("      Aggregate Superpowers:\n" +
                                        "         ");
                    Collections.sort(powers);
                    System.out.print(powers.get(0));
                    //loop through the list of powers and print them
                for(int i = 1; i< powers.size(); i++)
                    System.out.printf(", %s", powers.get(i));

                }
                System.out.println("\n");
                
                
                //then do the same for Villains in Marvel
            
                //initiate variables to calculate the avrage of the heroes and villains 
                avgInteligence = 0;
                avgStrength = 0;
                avgStamina = 0;
                avgSpeed = 0;
                avgSkills = 0;
                nrOfNPCs = 0;
                nrOfSP = 0;
                //create variable tp count the characters and know what to divide
                nrMarvelDC = 0;
                //also create an arraylist of strings to save all the superpowrrs
                powers = new ArrayList<>();
                //loop through the heroes and add the values
                for(int i = 0; i< characters.size(); i++)
                {
                    //if the character is marvel and hero add his stats 
                    if(characters.get(i).getUniverse().equals("Marvel") && characters.get(i).getTeam().equals("Villains"))
                    {
                        nrMarvelDC++;
                        //add the stats 
                        avgInteligence += characters.get(i).getIntelligence();
                        avgStrength += characters.get(i).getStrength();
                        avgStamina += characters.get(i).getStamina();
                        avgSpeed += characters.get(i).getSpeed();
                        avgSkills += characters.get(i).getSkills();
                        if(characters.get(i) instanceof SuperHV)
                        {
                            //if it's a superhero rise the number of superheroes and save the powers in the arraylist of strings
                            nrOfSP++;
                            SuperHV c = (SuperHV) characters.get(i);
                            //loop and add all the powers of the hero only if the super power is not in the list yet
                            for(int j = 0; j< c.getPowerSize(); j++)
                            {
                                String newP = c.getPower(j);
                                //isFoundPower will tell us if the power is alrady in the new arraylist
                                boolean isFoundPower = false;
                                for(int k = 0; k< powers.size(); k++)
                                    if(powers.get(k).equals(newP))
                                        isFoundPower = true;
                                if(isFoundPower ==  false)
                                    //if the power is not found in the arraylist of powers add it 
                                    powers.add(newP);
                            }
                        }
                        else
                            nrOfNPCs++;
                    }
                }
                avgInteligence = (double) avgInteligence / nrMarvelDC;
                avgSkills = (double) avgSkills / nrMarvelDC;
                avgSpeed = (double) avgSpeed / nrMarvelDC;
                avgStamina = (double) avgStamina / nrMarvelDC;
                avgStrength = (double) avgStrength / nrMarvelDC;
                //calculate the avrage and print them 
                System.out.printf("      Villain Stats:\n" +
                                    "         Average Intelligence: %.2f\n" +
                                    "         Average Strength:     %.2f\n" +
                                    "         Average Stamina:      %.2f\n" +
                                    "         Average Speed:        %.2f\n" +
                                    "         Average Skill:        %.2f\n" +
                                    "      Number of Normal-Person Villains:    %d\n" +
                                    "      Number of Villains with Superpowers: %d\n", avgInteligence, avgStrength, avgStamina, avgSpeed, avgSkills, nrOfNPCs, nrOfSP);
                if(nrOfSP > 0){
                    System.out.print("      Aggregate Superpowers:\n" +
                                        "         ");
                    Collections.sort(powers);
                    System.out.print(powers.get(0));
                for(int i = 1; i< powers.size(); i++)
                    System.out.printf(", %s", powers.get(i));

                }
                System.out.println("\n");
            }
            else
                //if not print th error message
                System.out.println("      There are currently no Marvel characters in the system.\n");
            
            //if there are characters start checking for DC charcaters 
            System.out.println("   DC Characters");
            //the isFound will tell us if there are DC characters or not
            isFound = false;
            for(int i = 0; i< characters.size(); i++)
                if(characters.get(i).getUniverse().equals("DC"))
                    isFound = true;
            if(isFound == true)
            {
                //if there are Marvel characters chekc the heroes 
                
                //define variables to calculate the avrage of the heroes and villains 
                double avgInteligence = 0;
                double avgStrength = 0;
                double avgStamina = 0;
                double avgSpeed = 0;
                double avgSkills = 0;
                int nrOfNPCs = 0;
                int nrOfSP = 0;
                //create variable tp count the characters and know what to divide
                double nrMarvelDC = 0;
                //also create an arraylist of strings to save all the superpowrrs
                ArrayList<String> powers = new ArrayList<>();
                //loop through the heroes and add the values
                for(int i = 0; i< characters.size(); i++)
                {
                    //if the character is marvel and hero add his stats 
                    if(characters.get(i).getUniverse().equals("DC") && characters.get(i).getTeam().equals("Heroes"))
                    {
                        nrMarvelDC++;
                        //add the stats 
                        avgInteligence += characters.get(i).getIntelligence();
                        avgStrength += characters.get(i).getStrength();
                        avgStamina += characters.get(i).getStamina();
                        avgSpeed += characters.get(i).getSpeed();
                        avgSkills += characters.get(i).getSkills();
                        if(characters.get(i) instanceof SuperHV)
                        {
                            //if it's a superhero rise the number of superheroes and save the powers in the arraylist of strings
                            nrOfSP++;
                            SuperHV c = (SuperHV) characters.get(i);
                            //loop and add all the powers of the hero only if the super power is not in the list yet
                            for(int j = 0; j< c.getPowerSize(); j++)
                            {
                                String newP = c.getPower(j);
                                //isFoundPower will tell us if the power is alrady in the new arraylist
                                boolean isFoundPower = false;
                                for(int k = 0; k< powers.size(); k++)
                                    if(powers.get(k).equals(newP))
                                        isFoundPower = true;
                                if(isFoundPower ==  false)
                                    //if the power is not found in the arraylist of powers add it 
                                    powers.add(newP);
                            }
                        }
                        else
                            nrOfNPCs++;
                    }
                }
                avgInteligence = (double) avgInteligence / nrMarvelDC;
                avgSkills = (double) avgSkills / nrMarvelDC;
                avgSpeed = (double) avgSpeed / nrMarvelDC;
                avgStamina = (double) avgStamina / nrMarvelDC;
                avgStrength = (double) avgStrength / nrMarvelDC;
                //calculate the avrage and print them 
                System.out.printf("      Hero Stats:\n" +
                                    "         Average Intelligence: %.2f\n" +
                                    "         Average Strength:     %.2f\n" +
                                    "         Average Stamina:      %.2f\n" +
                                    "         Average Speed:        %.2f\n" +
                                    "         Average Skill:        %.2f\n" +
                                    "      Number of Normal-Person Heroes:    %d\n" +
                                    "      Number of Heroes with Superpowers: %d\n", avgInteligence, avgStrength, avgStamina, avgSpeed, avgSkills, nrOfNPCs, nrOfSP);
                if(nrOfSP > 0){
                    //if there are super people print their powers
                    System.out.print("      Aggregate Superpowers:\n" +
                                        "         ");
                    Collections.sort(powers);
                    System.out.print(powers.get(0));
                    //loop through the powers and print them 
                for(int i = 1; i< powers.size(); i++)
                    System.out.printf(", %s", powers.get(i));

                }
                System.out.println("\n");
                
                
                //then do the same for Villains in DC
            
                //initiate variables to calculate the avrage of the heroes and villains 
                avgInteligence = 0;
                avgStrength = 0;
                avgStamina = 0;
                avgSpeed = 0;
                avgSkills = 0;
                nrOfNPCs = 0;
                nrOfSP = 0;
                //create variable tp count the characters and know what to divide
                nrMarvelDC = 0;
                //also create an arraylist of strings to save all the superpowrrs
                powers = new ArrayList<>();
                //loop through the heroes and add the values
                for(int i = 0; i< characters.size(); i++)
                {
                    //if the character is marvel and hero add his stats 
                    if(characters.get(i).getUniverse().equals("DC") && characters.get(i).getTeam().equals("Villains"))
                    {
                        nrMarvelDC++;
                        //add the stats 
                        avgInteligence += characters.get(i).getIntelligence();
                        avgStrength += characters.get(i).getStrength();
                        avgStamina += characters.get(i).getStamina();
                        avgSpeed += characters.get(i).getSpeed();
                        avgSkills += characters.get(i).getSkills();
                        if(characters.get(i) instanceof SuperHV)
                        {
                            //if it's a superhero rise the number of superheroes and save the powers in the arraylist of strings
                            nrOfSP++;
                            SuperHV c = (SuperHV) characters.get(i);
                            //loop and add all the powers of the hero only if the super power is not in the list yet
                            for(int j = 0; j< c.getPowerSize(); j++)
                            {
                                String newP = c.getPower(j);
                                //isFoundPower will tell us if the power is alrady in the new arraylist
                                boolean isFoundPower = false;
                                for(int k = 0; k< powers.size(); k++)
                                    if(powers.get(k).equals(newP))
                                        isFoundPower = true;
                                if(isFoundPower ==  false)
                                    //if the power is not found in the arraylist of powers add it 
                                    powers.add(newP);
                            }
                        }
                        else
                            nrOfNPCs++;
                    }
                }
                avgInteligence = (double) avgInteligence / nrMarvelDC;
                avgSkills = (double) avgSkills / nrMarvelDC;
                avgSpeed = (double) avgSpeed / nrMarvelDC;
                avgStamina = (double) avgStamina / nrMarvelDC;
                avgStrength = (double) avgStrength / nrMarvelDC;
                //calculate the avrage and print them 
                System.out.printf("      Villain Stats:\n" +
                                    "         Average Intelligence: %.2f\n" +
                                    "         Average Strength:     %.2f\n" +
                                    "         Average Stamina:      %.2f\n" +
                                    "         Average Speed:        %.2f\n" +
                                    "         Average Skill:        %.2f\n" +
                                    "      Number of Normal-Person Villains:    %d\n" +
                                    "      Number of Villains with Superpowers: %d\n", avgInteligence, avgStrength, avgStamina, avgSpeed, avgSkills, nrOfNPCs, nrOfSP);
                if(nrOfSP > 0){
                    //if there are super people print their total powers
                    System.out.print("      Aggregate Superpowers:\n" +
                                        "         ");
                    Collections.sort(powers);
                    System.out.print(powers.get(0));
                    //loop through the list of powers and print them
                for(int i = 1; i< powers.size(); i++)
                    System.out.printf(", %s", powers.get(i));

                }
                System.out.println("");
                
            }
            else
                //if not print th error message
                System.out.println("      There are currently no DC characters in the system.\n");
        }
    }
    
    public static void fitPower(ArrayList<String> powers, String power)
    {
        //this is before I found out there is a sort method for arraylists :)))
        //fortunately I figured that out before I stressed with finishing this 
        if(powers.isEmpty())
            powers.add(power);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line;
        ArrayList<Character> characters = new ArrayList<>();
        //create a new list of characters
        while(true){
            line = in.nextLine().split(",");
            //read the line with the command
            //depending on the command call the function corresponding 
            if(line[0].equals("ADDCHARACTER"))
                addCharacter(line, characters);
            if(line[0].equals("SEARCHCHARACTER"))
                searchCharcater(line, characters);
            if(line[0].equals("ADDPOWER"))
                addPower(line, characters);
            if(line[0].equals("FIGHT"))
                fight(line, characters);
            if(line[0].equals("DISPLAYHEROES"))
                displayHeroes(characters);
            if(line[0].equals("DISPLAYVILLAINS"))
                displayVillains(characters);
            if(line[0].equals("DISPLAYMARVEL"))
                displayMarvel(characters);
            if(line[0].equals("DISPLAYDC"))
                displayDC(characters);
            if(line[0].equals("DISPLAYSTATS"))
                DisplayStats(characters);
            if(line[0].equals("EXIT"))
            {System.out.println("Goodbye.\n");
            break;}
            //if they say QUIT exist the program 
        }
    }

}
