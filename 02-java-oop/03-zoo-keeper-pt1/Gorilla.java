package Mammals;

public class Gorilla extends Mammal {
    public Gorilla(){
        // Directly call from The Mammal Constructor
        super("Gorilla", 500);
    }
    public void eatBanana(){
        System.out.printf("I am a %s and I am eating a banana", this.species);
    }
    @Override
    public void takeDamage(int damageAmount){
        this.health -= (damageAmount/2);
    }
}
