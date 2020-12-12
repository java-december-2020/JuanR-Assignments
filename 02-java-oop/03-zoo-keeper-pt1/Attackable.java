package Mammals;

public interface Attackable {
    //Atackable things must have health
    int getHealth();

    void setHealth(int health);

    void takeDamage(int damageAmount);
}
