package zadania.sortowanie.zadaniaStr21;

import zadania.sortowanie.SelectionSort;

/*
        1. Napisz metodę do znajdowania wartości minimalnej w tablicy. Wypisz
        wartość oraz numer indeksu.
        2. Napisz metodę do znajdowania wartości minimalną w tablicy od indeksu
        a do indeksu b. Wypisz wartość oraz numer indeksu.
 */
public class Zadania {
    private static int zad1(int[] tab){
        int min=tab[0];
        for(int i=1;i<tab.length;i++){
            if(tab[i]>min){
                min=tab[i];
            }
        }
        return min;
    }

    public static Integer zad2(int[] tab, int a , int b){
        if(a>b || a<0 || b<0 || a>tab.length-1 || b>tab.length-1){
            System.out.println("zly zakres ");
            return null;
        }else{
            int min=tab[a];
            for(int i=a;i<=b;i++){
                if(tab[i]>min){
                    min=tab[i];
                }
            }
            return min;
        }

    }

    public static void main(String[] args) {
        int[] tablica= {43,56,11,95,17};
        Integer[] tablicaInt= {43,56,11,95,17};
       //System.out.println(zad2(tablica,2,4));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(tablicaInt);
        for( Integer x: tablicaInt){
            System.out.print(x+" ");
        }
    }
}
