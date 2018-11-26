package lambda_i_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdoStream {

    public static void zad1(){
        List<String> stringList = Arrays.asList("abc", "def","AsasaA","dadgasgaga");
        // 1&2
        List<String> stringList2 = stringList.stream()
                                .filter(str -> str.length()>3)
                                .map(str->str.substring(0,3))
                                .collect(Collectors.toList());
        for(String x: stringList2){
            System.out.print(x+" ");
        }

        //3
        int ile= (int)stringList.stream()
                    .filter(x->x.startsWith("A")&&x.endsWith("A"))
                    .count();
        System.out.println("\n"+ile);
        //4
        stringList.stream()
                .map(x->x.substring(0,x.length()-1))
                .filter(x->x.length()>2)
                .forEach(x-> System.out.print(x+" "));
    };
    public static String zwrocLosowyElemListy( List<String> s){
        String temp=s.stream().filter(str->str.length()==5).findAny().get().toString();
        s.stream().filter(x->x.length()==5).forEach(x-> System.out.println(x));
//        if(temp.length()==0)
//            {
//                return temp;
//            }
//        else
//            {
//                return "Brak elementu";
//            }
        return temp;
    }


        public static void main(String[] args) {
            List<String> listaString = Arrays.asList("abc", "def","AsasaA","dadgasgaga","12345","ds569");

            System.out.println(zwrocLosowyElemListy(listaString));

   // zad1();







        //for(String x: imiona) System.out.println(x);
    /*
        imiona.stream()
                .
                .forEach(imie -> System.out.print(imie +" "));



        imiona.stream()
                .map(imie-> imie.substring(0,1))
                .forEach(imie -> System.out.print(imie+" "));

        imiona.stream()
                .filter(imie -> imie.endsWith("a"))
                .sorted()
                .forEach(imie -> System.out.print(imie+" "));

                List<String> lista = imiona.stream()
                                    .filter(imie -> imie.endsWith("a"))
                                    .map(imie-> imie.substring(0,1))
                                    .sorted()
                                    .collect(Collectors.toList());
                lista.stream().forEach(x-> System.out.print(x+" "));
    */

    }
}
