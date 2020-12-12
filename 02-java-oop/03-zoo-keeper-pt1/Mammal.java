package Mammals;

public class Mammal  implements Attackable{
    protected String species;
    protected int health;

    public Mammal(String species, int health){
        this.species = species;
        this.health = health;
    }
    
    public String getSpecies(){
        return species;
    }
    public void getSpecies(String species){
        this.species = species;
    }
    public int getHealth(){
        return health;
    }

    public void takeDamage(int damageAmount){
        this.health -= damageAmount;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void attack(Attackable target){
        // Decrement health
        int targetHealth = target.getHealth();
        target.setHealth(targetHealth -= 5);
    }
}
