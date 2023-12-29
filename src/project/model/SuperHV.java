
package project.model;

import java.util.ArrayList;


public class SuperHV extends Character{
    private ArrayList<String> powers;

    public SuperHV(String name, String team, String universe, String homePlanet, int intelligence, int strength, int stamina, int speed, int skills) {
        super(name, team, universe, homePlanet, intelligence, strength, stamina, speed, skills);
        this.powers = new ArrayList<String>();
    }

    public SuperHV() {
        super();
        this.powers = new ArrayList<String>();
    }

    public String getPower(int i) {
        return powers.get(i);
    }
    public void addPower(String power){
        powers.add(power);
    }
    public int getPowerSize(){
        return powers.size();
    }

    @Override
    public String toString() {
        String t = super.toString();
        t += String.format("\n   Powers:       %s", getPower(0));
        for(int i = 1; i< powers.size(); i++)
            t+= String.format(", %s", getPower(i));
        return t;
    }
    
    
    
    
}
