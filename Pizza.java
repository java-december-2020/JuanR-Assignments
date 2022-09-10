public class Pizza {
    // Things Pizzas have
    private String name;
    private char size;
    private String[] toppings;
    private int slices;



    public Pizza(String name, char size, String[] toppings, int slices){
        this.name = name;
        this.size = size;
        this.toppings = toppings;
        this.slices = slices;
    }

    // methods
    // Things you can do
    // Setters
    public void setToppings(String[] toppings){
        this.toppings = toppings;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSlices(int slices){
        if(slices < 10){
            System.out.println("We dont do small pizzas");
            return;
        }
        this.slices = slices;
    }
    public void setSize(char size){
        this.size = size;

    }
    // getters
    public String[] getToppings(){
        return this.toppings;
    }
    public char getSize(){
        return this.size;
    }
    public String getName(){
        return this.name;
    }
    public String getSlices(){
        return this.slices;
    }
    // Eat method
    // Advertise 
    public int eatSlice(int slicesToEat){
        this.slices -= slicesToEat;
        return this.slices;
    }
    public void pizzaFight(Pizza otherPizza){
        int beginningSlices = otherPizza.getSlices();
        int totalSlices = beginningSlices - 2;
        otherPizza.setSlices(totalSlices);
        System.out.println(this.name + "pizza just took 2 slices from " + otherPizza.name);

    }
    public void displayPizza(){
        System.out.println("This is the  " + this.name + "that is a size " + this.size
        + Arrays.toString(this.toppings) + "toppings";
    }
}
