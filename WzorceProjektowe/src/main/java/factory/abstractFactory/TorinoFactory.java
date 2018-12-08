package factory.abstractFactory;

public class TorinoFactory extends AbstractFactory {
    @Override
    public Pizza orderPizza(String name) {

        if(name.toUpperCase().equals("A"))
            return new PizzaA();
        else{
            System.out.println("Brak pizzy: " + name);
            return null;
        }

    }

    @Override
    public Pasta orderPasta(String name) {
        if(name.toUpperCase().equals("A"))
            return new PastaA();
        else{
            System.out.println("Brak makaronu: " + name);
            return null;
        }
    }
}
