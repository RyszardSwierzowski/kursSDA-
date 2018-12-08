package factory.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class PizzaC implements Pizza{
    String name = "Pizza C";
    List<String> ingredients= Arrays.asList("Sos pomidorowy", "ser","pieczarki","kurczak");
//    public PizzaC(String name, List<String> ingredients) {
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
