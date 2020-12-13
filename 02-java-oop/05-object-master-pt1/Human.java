
public class Human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;


// constructor
public Human(int strength, String stealth, String intelligence){
    this.strength = 3;
    this.stealth = 3;
    this.intelligence = 3;
    this.health = 100;
    
// Setters
}
public void setStrength(int strength){
    this.strength = 3;
}
public void setStealth(int stealth){
    this.stealth = 3;
}
public void setIntelligence(int intelligence){
    this.intelligence = 3;
}
public void setHealth(int health){
    this.health = 100;
}

// Getters
public int getStrength(){
    return this.strength;
}
public int getStealth(){
    return this.stealth;
}
public int getIntelligence(){
    return this.intelligence;
}
public int getHealth(){
    return this.health;
}
// Attack Another Animal
public void battle(Human target, String powerMove){
    int damage;
    if(powerMove.equals("kick")){
        damage = 5;
    }
    else if(powerMove.equals("punch")){
        damage = 3;
    }
    else {
        System.out.println("Move not recognized");
        return;
    }

    // Multiply the strength * damage
    int effectiveDamage = this.strength * damage;
        
    // Reduce targets health by effectiveDamage
    int targetHealth = target.getHealth();
            target.setHealth(targetHealth -= effectiveDamage);
    
    // Print to the console what just happened using formatted string
    System.out.printf("%s attacks %s for %d health\n", target.getStealth(), effectiveDamage);
    System.out.printf("%s health is now %d", target.getHealth(), target.getHealth());
}
public void battle(Human target){
    battle(target, "kick");
}
}