package kolekcje;

import java.util.*;

public class Mapy
{
    static Map zadanie1(String... a){
        Map<Integer,String> mapa = new HashMap<>();
        for(int i=0;i<a.length;i++){
            mapa.put(i,a[i]);
        }
        return  mapa;
    }
    static void zadanie2(String a){
        Map<String,Integer> mapa = new HashMap<>();
        String znak;
        int wartosc;
        for(int i=0;i<a.length();i++){
            znak=a.substring(i,i+1);
            if(mapa.containsKey(znak)){
                wartosc=mapa.get(znak)+1;
                mapa.put(znak,wartosc);
            }
            else{
                mapa.put(znak,1);
            }
        }
        for(Map.Entry<String,Integer> wpis :mapa.entrySet()){
            System.out.println("znak: "+wpis.getKey()+" : "+wpis.getValue());
        }
    }
    static void zadanie3(Set<String> a){
        Map<String,Integer> mapa = new HashMap<>();
        String znak;
        int ileA=0;

        for( String x: a){
            ileA=0;
            for(int i=0;i<x.length();i++){
                znak=x.substring(i,i+1);
                if(znak.equals("a")){
                    ileA++;
                }
            }
            mapa.put(x,ileA);
        }
        for(Map.Entry<String,Integer> wpis :mapa.entrySet()){
            System.out.println("znak: "+wpis.getKey()+" : "+wpis.getValue());
        }
    }
    static void zadanie4(List<String> a){
        ArrayList<String> listaStr = new ArrayList<>();
        Map< Integer, ArrayList<String> > mapa = new HashMap<>();
        int rozmiar;
        for(String x:a){
            rozmiar=x.length();
            if(mapa.containsKey(rozmiar)){
                listaStr=mapa.get(rozmiar);
                listaStr.add(x);
                //mapa.put(rozmiar,listaStr);
            }
            else{
                ArrayList<String> lista = new ArrayList<>();

                lista.add(x);
                mapa.put(rozmiar,lista);
            }
        }
        for(Map.Entry<Integer, ArrayList<String>> wpis :mapa.entrySet()){
            System.out.print(wpis.getKey()+":  ");
            for(String x:wpis.getValue()){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    static boolean zadanie5(Map<String,String> m,List<String> l){
        for( String x:l){
            if(!m.containsKey(x) &&!m.containsValue(x)){
                return false;
            }
        }return true;
    }




    public static void main(String... a){
        /*
            Map<String,String> mapaOsob = new LinkedHashMap<>();
            mapaOsob.put("94032912930","Ryszard Swierzowski");
            mapaOsob.put("98032912915","Jacek Gmoch");
            mapaOsob.put("98032912915","Karol Kac");
            mapaOsob.put("82010112931","Ala Nowak");
             for(Map.Entry<String,String> wpis :mapaOsob.entrySet()){
                 System.out.println("Pesel: "+wpis.getKey()+" osoba: "+wpis.getValue());
             }
         */
        Map<String,String> capitalByCountry= new HashMap<>();
        capitalByCountry.put("Polska","Warszawa");
        capitalByCountry.put("Niemcy","Berlin");
        List<String> lista = new ArrayList<>();
            lista.add("Polska");
            lista.add("Berlin");
            lista.add("Warszawa");
            lista.add("Niemcy");
            lista.add("Kokos");


        Set<String> setStr = new HashSet<>();
            setStr.add("asdsafvzxa");
            setStr.add("das");
            setStr.add("s");
        ArrayList<String> listStr = new ArrayList<>();
            listStr.add("a");
            listStr.add("adad");
            listStr.add("abc");


        //zadanie2("MASdasdsakasdasas");
        //zadanie3(setStr);
        //zadanie4(listStr);
        System.out.println(zadanie5(capitalByCountry,lista));;

    }
}
