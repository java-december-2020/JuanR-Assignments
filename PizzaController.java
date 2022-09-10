// import java.util.Arrays;
public class PizzaController {
    public static void main(String[] args) {
        String[] pizza1Toppings = new String[] {"cheese", "pepperoni", "pineapples", "Jalapenos", "black olives"};
        String[] pizza2Toppings = new String[] {"Mushrooms", "bell peppers", "the kitchen sink"};


        Pizza theDeveroni = new Pizza("The Deveroni", 'L', pizza1Toppings, 16);
        Pizza theBlakeroni = new Pizza("The Deveroni", 'L', pizza2Toppings, 16);
        theDeveroni.setSlices(18);
        System.out.println(theDeveroni.getSlices());
        
        System.out.println(theBlakeroni.eatSlice(6));

        theDeveroni.displayPizza();
        theBlakeroni.displayPizza();

        theDeveroni.pizzaFight(theBlakeroni);
        System.out.println(theBlakeroni.getSlice);
    }
}
