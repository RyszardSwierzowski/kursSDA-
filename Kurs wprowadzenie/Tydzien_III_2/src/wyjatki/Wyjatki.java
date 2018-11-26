package wyjatki;

import java.util.Arrays;
import java.util.List;

public class Wyjatki
{

    public static Double divide(int a, int b){
        try{
            return (double) a/b;

        }catch (ArithmeticException e){
            System.out.println("dzielenie przez 0");
            return null;
        }
    }
    public static Double divideTwoArrayElem(int[] t, int a,int b){
        try{
            return divide(t[a],t[b]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("  zły index  ");
            return null;
        }

    }

    public static void main(String[] args) {

        int[] tabInt = {-5,2,3,4,0};
        //System.out.println(divide(-5,0));;

        //System.out.println(divideTwoArrayElem(tabInt,0,4));
        //System.out.println(divideTwoArrayElem(tabInt,11,2));
       // System.out.println(divideTwoArrayElem(tabInt,3,4));






//        try{
//            List<String> listaStr = Arrays.asList("jeden","dwa");
//            listaStr.stream()
//                    .filter(napis->napis.length()==4)
//                    .findAny().orElseThrow(NotFoundItem:: new);
//        }catch (NotFoundItem e){
//            System.out.println("wyjątek , bo nie znaleziono elementu");
//        }




    }
}
