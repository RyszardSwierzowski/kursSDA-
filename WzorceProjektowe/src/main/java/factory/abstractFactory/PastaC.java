package factory.abstractFactory;

public class PastaC implements Pasta {
    String name="Pasta C";
    String pastaType="type c";



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPastaType() {
        return this.pastaType;
    }
}
