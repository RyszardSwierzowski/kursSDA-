package factory.abstractFactory;

public class SicilianFactory extends AbstractFactory {
    @Override
    public Pizza orderPizza(String name) {

            if(name.toUpperCase().equals("B"))
                return new PizzaB();
            else if(name.toUpperCase().equals("C"))
                return new PizzaC();
            else{
                System.out.println("Brak pizzy: " + name);
                return null;
            }

    }

    @Override
    public Pasta orderPasta(String name) {
        if(name.toUpperCase().equals("B"))
            return new PastaB();
        else if(name.toUpperCase().equals("C"))
            return new PastaC();
        else{
            System.out.println("Brak makaronu: " + name);
            return null;
        }
    }
}
