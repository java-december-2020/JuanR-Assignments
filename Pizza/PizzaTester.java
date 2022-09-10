package Pizza;

public class PizzaTester {
    public static void main(String[] args){
    //  Pizza cheese = new Pizza();

    //  cheese.size = "Large";
    //  cheese.slices = 10;
    //  cheese.crustType = "deep dish";
    //  cheese.toppings = new String[] { "cheese" };
    //  cheese.displayPizza();

    Pizza cheese = new Pizza(new String[] {"cheese"}, "large", 10, "deep dish");
    cheese.displayPizza();
    Pizza pepperoni = new Pizza(new String[] {"cheese", "perpperoni"}, "Large", 10, "New York");
    Pizza meatPizza = new Pizza(new String[] {"cheese", "pepperoni", "sausage", "ham", "chicken" }, "Extra Large", 16, "Regular");
    Pizza hawaiian = new Pizza(new String[] {"ham", "pineapple"}, "Large", 10, "Regular Crust");
    System.err.println(Pizza.numberOfPizzas);
    pepperoni.setSize("medium");
    Pizza.advertise();
    pepperoni.pizzaFight(cheese);
    hawaiian.pizzaFight(pepperoni);
    }

}
