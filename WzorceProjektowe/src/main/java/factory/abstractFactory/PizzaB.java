package factory.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class PizzaB implements Pizza{
    String name = "Pizza B";
    List<String> ingredients= Arrays.asList("Sos pomidorowy", "ser","pieczarki");

//    public PizzaB(String name, List<String> ingredients) {
//        this.name = name;
//        this.ingredients = ingredients;
//    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<String> getIngredients() {
        return this.ingredients;
    }
}
