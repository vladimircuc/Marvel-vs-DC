
package project.model;

public class Stats {
    private int intelligence;
    private int strength;
    private int stamina;
    private int speed;
    private int skills;

    public Stats(int intelligence, int strength, int stamina, int speed, int skills) {
        this.intelligence = intelligence;
        this.strength = strength;
        this.stamina = stamina;
        this.speed = speed;
        this.skills = skills;
    }

    public Stats() {
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSkills() {
        return skills;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return String.format("""
                             Stats:        Intelligence: %d
                                           Strength:     %d
                                           Stamina:      %d
                                           Speed:        %d
                                           Skills:       %d""", getIntelligence(), getStrength(), getStamina(), getSpeed(), getSkills());
    }
}
