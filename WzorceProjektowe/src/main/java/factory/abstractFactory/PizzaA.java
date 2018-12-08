package factory.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class PizzaA implements Pizza {

    String name="Pizza A";
    List<String> ingredients = Arrays.asList("sos pomidorowy","pieczarki");

//    public PizzaA(String name, List<String> ingredients) {
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
