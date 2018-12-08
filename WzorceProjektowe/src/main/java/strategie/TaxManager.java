package strategie;

import java.util.Map;

public class TaxManager {

    static  Map<Country,TaxStartegy> strategyMap;
    static {
        strategyMap.put(Country.PL,new PLTax());
        strategyMap.put(Country.USA,new USATax());

    }

    public float calculate
    public static TaxStartegy getStrategy(Country countryCode){
        if(countryCode==Country.PL)
            return new PLTax();
        if(countryCode==Country.USA)
            return new USATax();
        return null;
    }
}
