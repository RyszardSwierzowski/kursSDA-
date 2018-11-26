package kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listy
{


     static void zadanie1(List<Integer> a){
         a.stream().forEach(s-> System.out.println(s));
     }
     static void zadanie2(List<Integer> a){



         for(int i=0;i<a.size();i++){
                System.out.println(i+". "+a.get(i));
            }
     }
     static double zadanie3(List<Integer> a){
         if(a.size()==0){
             return  0;
         }
         int suma=0;
         for(Integer x: a){
             suma=suma+x;
         }
         return suma/a.size();
     }
     static boolean zadanie4(List<String> a){

         for(String x: a){
             if(x.length()>=3){
                 if(x.substring(0,3).equals("abc")){
                     return true;
                 }
             }
         }
         return false;
     }
     static void zadanie5( List<String> a){
        int parzysta=0;
        int nieParzysta=0;
        for(String x:a){
            if(x.length()%2==0){
                parzysta++;
            }else{
                nieParzysta++;
            }
        }
         System.out.println("Liczba nieparzystych elementów listy to : "+nieParzysta);
         System.out.println("Liczba parzystych elementów listy to : "+parzysta);

     }
     static boolean zadanie6(Set<String> a){
         for(String x:a){
             if(x.length()>=3){
                 if(x.substring(x.length()-3).equals("cde")){
                     return true;
                 }
             }
         }
         return false;

     }
     static  HashSet zadanie7(List<String>a){
        HashSet<String> zb = new HashSet<>();
        for(String x: a){
            zb.add(x);
        }
        return zb;
     }
     static List zadanie8(Set<String> a){
         ArrayList<String> listaStringow = new ArrayList<>();
         for(String x: a){
             listaStringow.add(x);
         }
         return listaStringow;
     }


     static <T> ArrayList<T> zadanie8Generyczne(HashSet<T> a){

         return new ArrayList<>(a); // istnieje konstruktor przyjmujący SETa i zwracający ArrayList
     }
     static <T> HashSet<T> zadanie7Generyczne(ArrayList<T> a){

            return new HashSet<>(a);
        }

    public static void main(String... a){

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("a");
        listStr.add("adad");
        listStr.add("abc");
        HashSet<String> zbiorStr= new HashSet<>();
        zbiorStr.add("dasdas");
        zbiorStr.add("dasdas");
        zbiorStr.add("das");
        zbiorStr.add("a");
        //zbiorStr.add("asdsadascde");

        //System.out.println(zadanie4(listStr));
        //zadanie5(listStr);
        //System.out.println(zadanie6(zbiorStr));
        /*
        for(Object z:zadanie7(listStr)){
            System.out.println(z);
        }
        */
        for(Object z:zadanie8(zbiorStr)){
            System.out.println(z);
        }
        ArrayList<String> x = new ArrayList();
        String[] sss = {"a","b"};

    }

}
