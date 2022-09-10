package Animal;

public class AnimalController {
    public static void main(String[] args){
        Animal lion = new Animal("Leo", 'M', "rolling plains", 12);
        Animal bear = new Animal("Barry", 'M', "alaska", 12);
        Animal goat = new Animal("Billy", "field");
        lion.battle(bear, "scratch");
    }
}
