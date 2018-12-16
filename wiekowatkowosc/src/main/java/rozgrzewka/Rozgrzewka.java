package rozgrzewka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rozgrzewka {
    public static void main(String[] args) {
        int ile;
        String ile2;
        String input;
        Scanner scanner = new Scanner(System.in);
        char[] array;


        System.out.println("Podaj liczbę ciągów znaków ");
        ile2=scanner.nextLine();
        ile=Integer.parseInt(ile2);
        List<String> lista = new ArrayList();
        for(int i=0;i<ile;i++){
            System.out.println("podaj ciąg znakow : ");
            input=scanner.nextLine();
            lista.add(input);
        }

        for(String x :lista){
            array=x.toCharArray();
            wypiszCiąg(array);

        }



    }
    public static void wypiszCiąg(char[] tab){
        String temp="";
        String resoult="";
        char znak;
        int ile=0;
        int tempInt;
        for(int i=0;i<tab.length-1;i++){
            tempInt=i+1;
            while(tab[i]==tab[tempInt]&& tempInt<tab.length){
                tempInt++;
            }
            if(tempInt-i>1){
                temp=String.valueOf(tab[i])+(tempInt-i);
                i=tempInt;

            }
            else{
                temp=String.valueOf(tab[i]);
            }

            System.out.print(temp);



        }






//;        for(int i= 0;i<tab.length-1;i++){
//            if(tab[i]==tab[i+1]){
//                znak1=tab[i];
//                ile++;
//            }else{
//                if(ile==1){
//                    temp+=tab[i];
//                }else{
//                    znak1=tab[i];
//                    temp+=znak1+ile;
//                    ile=1;
//                }
//
//            }
//        }
        System.out.println(resoult);

    }
}
