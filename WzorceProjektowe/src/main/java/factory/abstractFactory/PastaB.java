package factory.abstractFactory;

public class PastaB implements Pasta {
    String name="Pasta B";
    String pastaType="type b";



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPastaType() {
        return this.pastaType;
    }
}
