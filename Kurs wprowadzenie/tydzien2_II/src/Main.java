import java.util.Random;

public class Main
{
// ------------------------------------------------    T A B L I C E   -------------------------------------------------
    static int[] tab={1,2,3,4,5,6,7,8,9,-2};
    static int[] tab2={1,2,3,4,5,6,7,8,900,-2};
    static int[] tab3={5,5,2,2,1,1,1};
// ------------------------------------------------    M E T O D Y   ---------------------------------------------------
    static void zwrocTablice(int n) {
        int[] tablica = new int[n];
        Random random = new Random();
        for (int x: tablica)
        {
            x=random.nextInt(51);
            System.out.print(x+" " );
        }
    }
    static int getMax(int[]tab){
        int max=tab[0];
        for(int x : tab)
        {
            if(max< x) max=x;
        }
        return max;
    }
    static int getMin(int[] tab){
        int min=tab[0];
        for(int x : tab)
        {
            if(min> x) min=x;
        }
        return min;
    }
    static int getSum(int[] tab){
        int sum=0;
        for(int x : tab)
        {
            sum=sum+x;
        }
        return sum;
    }
    static int[] getMaxMinAndSum(int[] tab){
        int[] result=new int[3];

        result[0]= getMax(tab);
        result[1]= getMin(tab);
        result[2]= getSum(tab);
        return  result;
    }
    static int[] getLarger(int[]tab1,int[]tab2){
        int a=getSum(tab1);
        int b=getSum(tab2);
        if(a>b) return tab1;
        return tab2;
    }
    static int[] merge(int[]tab,int[]tab2){
        int licznik=0; // obecnie dodawany index w tablicy temp przechowywującej unikalne wartości z tablic tab oraz tab2 podawanych jako argumenty metody
        int[] temp=new int[tab.length+tab2.length]; // tworzenie tablicy o rozmiarze równym sumie rozmiaru tab1 oraz tab2 - przypadek kiedy dwie tablice zawierają tylko unikalne wartości względem siebie
        for(int z : tab)
        {
            if(czyJestJuzWTablicy( z ,temp)==false) // spr czy wartość występuje już w tablicy temp || jeśli nie to dodajemy ją do tej tablicy
            {
                temp[licznik]=z;
                licznik++;
            }
        }
        for(int z : tab2)
        {
            if(czyJestJuzWTablicy( z ,temp)==false)
            {
                temp[licznik]=z;
                licznik++;
            }
        }
        temp=usunZTablicyPolaBezInicjalizacji(licznik,temp); // zmniejszamy rozmiar tablicy temp do ilości unikalnych elementów


       return temp;
    }
    static boolean czyJestJuzWTablicy(int x,int[]tablica){ // metoda sprawdza czy dany element jest w tablicy -- x -> spr element || tablica -> tablica w której sprawdzamy daną wartość czy występuje
        for (int xx:tablica)
        {
            if(xx==x) return true;
        }
        return false;
    }
    static int[] usunZTablicyPolaBezInicjalizacji(int maxIndex, int[]tablica){ //metoda zwraca nową tablicę na podstawie podanej tablicy skróconej do wartości indexu -> maxIndex
        int[] tempp = new int[maxIndex];
        for(int i=0;i<tempp.length;i++)
        {
            tempp[i]=tablica[i];
        }
        return  tempp;
    }
    static int[] getDistinct(int[] tablica){
        int[] temp = new int[tablica.length];
        int licznik=0;
        for(int z : tablica)
        {
            if(czyJestJuzWTablicy( z ,temp)==false)// spr czy wartość występuje już w tablicy temp || jeśli nie to dodajemy ją do tej tablicy
            {
                temp[licznik]=z;
                licznik++;
            }
        }
        temp=usunZTablicyPolaBezInicjalizacji(licznik,temp);  // zmniejszamy rozmiar tablicy temp do ilości unikalnych elementów

        return temp;
    }
// ------------------------------------------------    M A I N   -------------------------------------------------------
    public static void main(String[] args)
    {
        /* Zdania część pierwsza
            zwrocTablice(5);
            System.out.println(getMax(tab));
            System.out.println(getMin(tab));
            System.out.println(getSum(tab));
            for(int x: getMaxMinAndSum(tab)) System.out.print(x+" ");
            for(int x: getLarger(tab,tab2)) System.out.print(x+" ");
            for(int x: merge(tab,tab2)) System.out.print(x+" ");
            for(int x: getDistinct(tab3)) System.out.print(x+" ");
        */





    }


}
