public class Varargs implements interface_1{

    @Override  public  String concat(int x , String... args){
        String a="";
        for(String xx: args){
            a=a+"_"+xx;
        }
        return x+"_"+a;
    }
    @Override  public  String concat2(int x , String... args){
        String a="";
        String odstep=pomnoz(x);

        for(int y=0;y<args.length;y++)
        {
            if(y<args.length-1)a=a+args[y]+odstep;
            else a=a+args[y];
        }
        return a;
    }
    private static String pomnoz(int x){
        String symbol="";
        for(int y=0;y<x;y++)
        {
            symbol=symbol+"_";
        }
        return symbol;
    }


}
