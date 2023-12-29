
package project.commands;

import java.util.ArrayList;
import project.model.SuperHV;
import project.model.Character;

public class Fight {
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
}
