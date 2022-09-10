public class Test {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;
    public void attack(Test target) {
        target.health -= this.strength;
    }
}