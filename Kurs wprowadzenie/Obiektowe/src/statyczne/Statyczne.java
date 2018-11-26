package statyczne;

public class Statyczne {
    private static int x=3;


    public static void inicjalizujLiczba(int x){
          final  int LICZBA=x;
    }
    public static void zwieksz(){
        x++;
    }
     public void wypisz(){
        System.out.println(x);
     }

     public static void main(String... a)
     {

     }

}
