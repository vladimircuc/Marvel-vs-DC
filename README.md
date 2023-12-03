# Marvel-vs-DC
My program will save heroes and humans in a data base using 2 different classes, depending if we add a human or a super human   
The super human class extends the normal character class which is for noraml humans  
Every character also has a stats variable where the specific stats are saved   
The program needs exact input in order to work so here is an example of input and details on what each input does:   
ADDCHARACTER,Bruce Banner,Heroes,Marvel,Earth,10,1,1,1,2 //this input adds a character with name Bruce Banner, team Heroes, universe marvel   
                                origin: Earth and his stats for intelligence, strength, stamina, speed and skills     
ADDCHARACTER,superhv,Hulk,Heroes,Marvel,Earth,1,8,8,4,3,Superhuman Strength //this input adds a superHero with name Hulk, (superhv specifie that the charcter has powers), team Heroes,       
                                origin: Earth and his stats for intelligence, strength, stamina, speed and skills and his super power: Superhuman Strength    
SEARCHCHARACTER,Tony Stark //this function looks for a character names Tony Stark and prints his details   
ADDPOWER,The Flash,Superhuman Strength  //this function adds a super power (Superhuman Strength) to the character named The Flash   
FIGHT,Captain Marvel,Thanos  // this input makes the 2 characters (Captain Marvel and Thanos) fight. RULES:   
                                                          A character with superpowers will always win against an NPC    
                                                          If both players are NPCs or if both players possess superpowers, wecalculate the total attack ability of each   
                                                          We add together the five individual statistics within the Stats object of the given character   
                                                          To that sum, we now add 10 additional points for each superpower the  given character possesses.   
 DISPLAYHEROES //this input displays all heroes    
 DISPLAYVILLAINS //this input displays all villains   
 DISPLAYMARVEL //this input displays all Marvel characters    
 DISPLAYDC // this input displays all DC characters  
 DISPLAYSTATS //this fucntion display stats for all characters   
 QUIT // this inpout terminates the program (we always need this as the last input)

BEST WAY TO TRY THIS PROGRAM IS BY INPUTTING THE SAMPLE INPUT AND SEE HOW IT ACTS     
CHECK SAMPLE INPUT FILE       
Download and have fun :) 




