package stringi;

public class Strinngi {
    public static void wypiszOdADoZ(){
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
    }
    public static void wypiszOdADoZCoDrugi(){
        for (int i = 97; i <= 122; i++) {
            if(i%2==1){
                System.out.print((char) i + " ");
            }

        }
    }
    public static void wypiszOdZDoA(){
        for (int i = 122; i <= 97; i--) {
            System.out.print((char) i + " ");
        }
    }
    public static void najwieksza(String s){
        char[] tabS = s.toCharArray();
        int max=-1;
        int znak;
        for(int i=0;i<tabS.length;i++){
            znak=tabS[i];
            if(max<znak) {
                max=znak;
            }
        }
        System.out.println((char)max);
    }
    //--------------------------------------------------------------------
    public static void suma(String  s){

        int suma=0;
        String[] parts=s.split("");
        for(String x:parts){
            suma=suma+Integer.parseInt(x);
        }
        System.out.println(suma);

    }
    public static  void mirror(String s){
        char[] parts=s.toCharArray();
        int liczbaWrazów=0;
        for(char a: parts) {
            if (a >= 65 && a <= 90) {
                liczbaWrazów++;
            }
        }
        String[] wyrazy = new String[liczbaWrazów];
        String wyraz=String.valueOf(parts[0]);
        for(int i=1;i<parts.length;i++)
        {
            if((parts[i]>=65&& parts[i]<=90)|| i==parts.length-1){
                if(i==parts.length-1){
                    wyraz=wyraz+parts[i];
                }
                wyrazy[liczbaWrazów-1]=wyraz;
                liczbaWrazów--;
                wyraz=String.valueOf(parts[i]);

            }else{
                wyraz=wyraz+parts[i];
            }

        }
        for(String q: wyrazy){
            System.out.print(q);
        }
    }
    public static void zliczWystapienia(String s) {
        char[] tablicaWystapien = s.toCharArray();
        //String[] part = s.split("");
        int[] wystapienia = new int[4];
        int znak;

        for (int i = 0; i < tablicaWystapien.length; i++) {
            znak=tablicaWystapien[i];
            //System.out.println(znak);
            if ((znak >= 97 && znak <= 122)||znak >= 65 && znak <= 90) {
                wystapienia[0] = wystapienia[0] + 1;// litera
            }
            else if (znak == 32) {
                wystapienia[1] = wystapienia[1] + 1; // spacje
            }
            else if (znak >= 48 && znak <= 57) {
                wystapienia[2] = wystapienia[2] + 1; // cyfry
            }
            else {
                wystapienia[3] = wystapienia[3] + 1;// inne
            }
        }
        System.out.println("Litery : "+wystapienia[0]);
        System.out.println("Spacje : "+wystapienia[1]);
        System.out.println("Cyfry  : "+wystapienia[2]);
        System.out.println("Inne   : "+wystapienia[3]);
    }
    public static String trzyPierwsze(String s){

        String wyraz =s.replaceAll(" ","");
        int max=3;
        if(wyraz.length()<max){
            max=wyraz.length();
        }
        return wyraz.substring(0,max);
    }
    public static String czteryOstatnie(String s ){
        String wyraz = s.replaceAll(" ", "_");

        int max=4;
        if(wyraz.length()<max){
            max=wyraz.length();
        }
        return (wyraz.substring(wyraz.length()-max,wyraz.length()));

    }
}
