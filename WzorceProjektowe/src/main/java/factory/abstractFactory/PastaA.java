package factory.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class PastaA implements Pasta{
    String name="Pasta A";
    String pastaType="type a";



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPastaType() {
        return this.pastaType;
    }


}
