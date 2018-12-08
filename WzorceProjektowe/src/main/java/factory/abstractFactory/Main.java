package factory.abstractFactory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaA();
        Pizza pizza2 = new PizzaC();

        Pasta pasta1 = new PastaA();
        Pasta pasta = new PastaB();

        System.out.println(pizza1.getIngredients());
        System.out.println(pizza1.getName());

        System.out.println(pizza2.getIngredients());
        System.out.println(pizza2.getName());

        Pizza produkt1 = new TorinoFactory().orderPizza("b");
        Pasta produkt2 = new TorinoFactory().orderPasta("a");

//        String factoryProducer =new FactoryProducer().getFactory(produkt2);
//        System.out.println(factoryProducer);


    }



}
