
public class Character {
    private String name;
    private String team;
    private String universe;
    private String homePlanet;
    private Stats s;

    public Character() {
        this.s = new Stats();
    }

    public Character(String name, String team, String universe, String homePlanet, int intelligence, int strength, int stamina, int speed, int skills) {
        this.name = name;
        this.team = team;
        this.universe = universe;
        this.homePlanet = homePlanet;
        this.s = new Stats(intelligence, strength, stamina, speed, skills);
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getUniverse() {
        return universe;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public int getIntelligence() {
        return s.getIntelligence();
    }

    public int getStrength() {
        return s.getStrength();
    }

    public int getStamina() {
        return s.getStamina();
    }

    public int getSpeed() {
        return s.getSpeed();
    }

    public int getSkills() {
        return s.getSkills();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public void setIntelligence(int intelligence) {
        s.setIntelligence(intelligence); 
    }

    public void setStrength(int strength) {
        s.setStrength(strength);
    }

    public void setStamina(int stamina) {
        s.setStamina(stamina);
    }

    public void setSpeed(int speed) {
        s.setSpeed(speed);
    }

    public void setSkills(int skills) {
        s.setSpeed(skills);
    }

    @Override
    public String toString() {
        String t;
        t = String.format("   Name:         %s\n" +
                        "   Team:         %s\n" +
                        "   Universe:     %s\n" +
                        "   Home Planet:  %s\n" +
                        "   Stats:        Intelligence: %d\n" +
                        "                 Strength:     %d\n" +
                        "                 Stamina:      %d\n" +
                        "                 Speed:        %d\n" +
                        "                 Skills:       %d", getName(), getTeam(), getUniverse(), getHomePlanet(), getIntelligence(),
                                           getStrength(), getStamina(), getSpeed(), getSkills());    
        return t;
    }
    
    
    
    
    
    
}
