import java.util.Random;
import java.util.Scanner;

public class Main
{
    static int[] tab = {1,2,3,4,5,6,7,8,9,10};
    static void zad6_1() {
        Random rand = new Random();
        int[] tablica = new int[10];
        int max=0;
        for(int i=0;i<tablica.length;i++) tablica[i]=rand.nextInt(50)+1 ;
        for(int i=0;i<tablica.length;i++)
        {
            if(tablica[i]>=max) max =tablica[i];
        }
        System.out.println(max);
        wypisz(tablica);
    }
    static void zad6_2() {
        Random rand = new Random();
        int[] tablica = new int[10];
        int max=0;
        int indexMax=-1;
        for(int i=0;i<tablica.length;i++) tablica[i]=rand.nextInt(50) + 1;
        for(int i=0;i<tablica.length;i++)
        {
            if(tablica[i]>=max)
            {
                max =tablica[i];
                indexMax=i;
            }
        }
        System.out.println(indexMax);
        wypisz(tablica);
    }
    static void zad6_3(int index){

        int[] tablica = tab;
        wypisz(tablica);

        int[] temp = new int[tablica.length-1];
        for(int i =0;i<index; i++)
        {
            temp[i]=tablica[i];
        }
        for(int i =index;i<temp.length;i++)
        {
            temp[i]= tablica[i+1];
        }
        tablica=temp;
        wypisz(tablica);

    }
    static void zad6_4(int wartosc){
        int[] tablica = tab;
        wypisz(tablica);
        int index=-1;
        for(int i=0;i<tablica.length;i++)
        {
            if(tablica[i]==wartosc)
            {
                index=i;
            }
        }
        if(index==-1) System.out.println("Brak podanej wartości");
        else {
            int[] temp = new int[tablica.length-1];
            for(int i =0;i<index; i++)
            {
                temp[i]=tablica[i];
            }
            for(int i =index;i<temp.length;i++)
            {
                temp[i]= tablica[i+1];
            }
            tablica=temp;
            wypisz(tablica);


        }
    }
//    static void zad6_5(){
//        int[] lotek = new int[6];
//        int[] lotekPodajLiczby = new int[6];
//        Random rand = new Random();
//        int losowanie=-111;
//        boolean dostepna=false;
//        boolean poprawna=false;
//        int trafione=0;
//        String liczba="0";
//        for(int i=0;i<lotek.length;i++)
//        {
//            while(dostepna==false)
//            {
//                losowanie=rand.nextInt(49) + 1;
//                dostepna=true;
//                for(int j = 0;j<i;j++) if(lotek[j]==losowanie) dostepna=false;
//            }
//            lotek[i]=losowanie;
//            dostepna=false;
//         }
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i=0;i<lotekPodajLiczby.length;i++)
//        {
//            poprawna=false;
//            while(poprawna==false)
//            {
//                System.out.print("podaj liczbę nr " +(i+1)+": ");
//                liczba=scanner.nextLine();
//                try
//                {
//                    Integer.parseInt(liczba);
//                    poprawna=sprLiczbe(Integer.parseInt(liczba),lotekPodajLiczby);
//                }catch (java.lang.NumberFormatException e)
//                {
//                    ;
//                }
//
//
//            }
//            lotekPodajLiczby[i]=Integer.parseInt(liczba);
//        }
//
//        System.out.print(" Trafione");
//
//        for(int x=0;x<lotek.length;x++)
//        {
//            for(int y=0;y<lotekPodajLiczby.length;y++)
//            {
//                if(lotek[x]==lotekPodajLiczby[y]) System.out.print(lotekPodajLiczby[x]+" ");
//            }
//        }
//        for(int x : lotek)
//        {
//            for(int y: lotekPodajLiczby)
//            {
//                if( x==y)
//                {
//                    System.out.print(x+"");
//                    trafione++;
//                }
//
//            }
//        }
//        System.out.println();
//        System.out.println("trafiono "+ trafione);
//        wypisz(lotek);
//        wypisz(lotekPodajLiczby);
//
//    }
    static void wypisz(int[] tab) {
        for(int x : tab) System.out.print(x+" ");
        System.out.println();
    }
    static boolean sprLiczbe( int liczba, int[] tablica) {
        boolean dostpena=true;

        for(int i = 0;i<tablica.length;i++)
        {
            if(liczba==tablica[i]|| liczba<1|| liczba>49) dostpena=false;
        }
        return dostpena;
    }


    static void zad7_1()
    {
        System.out.println("Gotowe");
    }
    static double zad7_2(int liczba) {
        return Math.sqrt(liczba) ;
    }
    static double zad7_3(double r)
    {
        return Math.PI*r*r;
    }
    static void zad7_4(int[] tablica) {
        for(int x:tablica){
            System.out.print(x+ " ");
        }
    }
    static void zad7_5a() {
        int x;
        String liczba;
        for(int i=1;i<11;i++)
        {
            for(int j=1;j<11;j++)
            {
                x=i*j;
                if(x<10) liczba=String.valueOf("  "+x);
                else if(x<100)liczba=String.valueOf(" "+x);
                else liczba=String.valueOf(x);

                System.out.print(liczba);
            }
            System.out.println();
        }
    }
    static void zad7_5b(int x,int y) {
         int a;
        String liczba;
        for(int i=1;i<=y;i++)
        {
            for(int j=1;j<=x;j++)
            {
                a=i*j;
                if(a<10) liczba=String.valueOf("  "+a);
                else if(a<100)liczba=String.valueOf(" "+a);
                else liczba=String.valueOf(a);

                System.out.print(liczba);
            }
            System.out.println();
        }
    }
    static boolean zad7_6(int x)
    {
        return x%2==0;
    }
    static boolean zad7_7(int x,int[] tab) {
        for(int z: tab)
        {
            if(x==z) return true;
        }
        return false;
    }

    static void lotekv2() {
        int[] lotekGenerator= new int[6];
        int[] lotekUser = new int[6];

        // generowanie liczb przez automat
        lotekGenerator=genrujLiczby();
                wypisz(lotekGenerator);

        // podawanie liczb przez usera
        lotekUser=pobierzLiczby();
        wypisz(lotekUser);
        // porównanie tablic
        System.out.println("Liczba trafień: "+zlicz(lotekGenerator,lotekUser))        ;


    }
    static int[] genrujLiczby() {
        boolean dostepna=false;
        int[] tablica = new int[6];
        int losowanie=-99;
        Random rand = new Random();
        for(int i=0;i<tablica.length;i++)
        {
            while(dostepna==false)
            {
                losowanie=rand.nextInt(49) + 1;
                dostepna=true;
                for(int j = 0;j<i;j++) if(tablica[j]==losowanie) dostepna=false;
            }
            tablica[i]=losowanie;
            dostepna=false;
        }
        return tablica;
    }
    static int[] pobierzLiczby() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[6];
        boolean poprawna=false;
        String liczba="";
        String wybor="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 6 liczb człkowitych z zakresu 1-49");
         for(int i=0;i<tab.length;i++)
         {
             poprawna=false;
             while(poprawna==false)
             {
                 System.out.print("Podaj liczbe " +(i+1)+": " );
                 wybor=scan.nextLine();
                 poprawna=testuj(wybor,tab);
             }
             tab[i]=Integer.parseInt(wybor);
         }
    return tab;
    }
    static boolean testuj(String str, int[] tab) {
        int x;
        try
        {
           x=Integer.parseInt(str);
            if(czyJestWTablicy(x,tab)==false && x>0&&x<49) return true;
            else return false;
        }catch (java.lang.NumberFormatException e){}
        return false;
    }
    static boolean czyJestWTablicy(int x,int[] tab) {
        for(int i=0;i<tab.length;i++)
            if(tab[i]==x) return true;
        return false;
    }
    static int zlicz(int[] genetator, int[] user) {
        int trafienia=0;
        for(int i=0;i<genetator.length;i++)
        {
            for(int j=0;j<user.length;j++)
            {
                if(genetator[i]==user[j]) trafienia++;
            }
        }
        return trafienia;
    }


    public static void main(String[] args)
    {
        //zad6_1();
        //zad6_2();
        //zad6_3(4);
        //zad6_4(7);
        //zad6_5();
        //System.out.println(zad7_2(77));
        //zad7_5a();
        //zad7_5b(4,9);

        //System.out.println(zad7_6(4));
        //System.out.println(zad7_7(33,tab));

        lotekv2();






    }
}
