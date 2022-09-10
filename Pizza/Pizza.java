package Pizza;

import java.util.Arrays;

public class Pizza {
    // Things that pizzas have
    // Array of strings that hold the toppings
    // string that holds on to the size
    // int of # of slices
    // String type of crust
    public String[] toppings;
    public String size;
    public int slices;
    public String crustType;
    public static int numberOfPizzas;

    public Pizza(String[] toppings, String size, int slices, String crustType) {
        this.size = size;
        this.toppings = toppings;
        this.slices = slices;
        this.crustType = crustType;
        numberOfPizzas++;
    }

    // Getters
    public String[] getToppings(){
        return this.toppings;
    }
    public String[] getSize(){
        return this.toppings;
    }
    public int getSlices(){
        return this.slices;
    }
    public String getCrustType(){
        return this.crustType;
    }
    public int getNumOfPizza(){
        return this.numberOfPizzas;
    }
    // Setters
    public void setToppings(String[] toppings){
        this.toppings = toppings;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setSlices(int slices){
        this.slices = slices;
    }
    public void setCrustType(String crustType){
        this.crustType = crustType;
    }
    // Things our pizza can do 
    // Method to advertise
    // Eat a slice of pizza
    // Display the type of pizza


    public void displayPizza(){
        System.out.println("This is a " + Arrays.toString(toppings) + "pizza that is size" + size + "with" + slices + "slices.");
    }
    public static void advertise(){
        System.out.println("Hey you come check out thee pizzas");
    }
    public void eatSlice(int slices){
        System.out.println("You just ate" + slices + "slices");
        this.slices -= slices;
        System.out.println("Now this pizza has" + this.slices + "slices")
    }

    public void pizzaFight(int slice, Pizza otherPizza){
        int beginningSlices = otherPizza.getSlices();
        int totalSlices = beginningSlices - 2;
        otherPizza.setSlices(totalSlices);
        System.out.println(Arrays.toString(otherPizza.toppings)+ "PIzza just got wollopped, and now has" + otherPizza.getSlices() + "slices");
    }
}
