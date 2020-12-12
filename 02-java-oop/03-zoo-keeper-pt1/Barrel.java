package Mammals;

public class Barrel implements Attackable{
    private int health;
    public Barrel(){
        this.health = 5;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void takeDamage(int damageAmount){
        this.health -= damageAmount;
    }
}
