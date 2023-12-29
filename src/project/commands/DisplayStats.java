
package project.commands;

import java.util.ArrayList;
import java.util.Collections;
import project.model.SuperHV;
import project.model.Character;

public class DisplayStats {
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
}
