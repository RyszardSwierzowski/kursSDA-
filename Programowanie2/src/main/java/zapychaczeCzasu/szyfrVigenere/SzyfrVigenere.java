package zapychaczeCzasu.szyfrVigenere;

public class SzyfrVigenere {

    static char[][] tab = new char[26][26];
    static int litera = 65;


    private static void tworzTablice() {

        for (int i = 0; i < 26; i++) {
            litera = 65 + i;
            for (int j = 0; j < 26; j++) {

                tab[i][j] = (char) litera;
                //System.out.print(tab[i][j]);

                litera++;
                if (litera > 90)
                    litera = 65;
            }
            //System.out.println();


        }


    }

    private static String generujWiadomosc(String wiadomosc, String klucz) {
        tworzTablice();
        String result="";
        char[] w = wiadomosc.toCharArray();
        char[] k = klucz.toCharArray();
        int kolumna;
        int wiersz;
        if (wiadomosc.replaceAll(" ", "").length() == klucz.replaceAll(" ", "").length())
        {
            for( int i =0;i< wiadomosc.length();i++){

                kolumna=w[i]-65;
                wiersz=k[i]-65;
                System.out.print(kolumna+" ");
               if(!(kolumna==-33 || wiersz==-33))
                   result+=tab[kolumna][wiersz];
               else
                   result+=" ";

            }
            return  result;

        }else
            return "klucz ma inną długość jak klucz";
    }
//    private static String odkoduj(String zaszyfrowanaWiadomosc, String klucz) {
//        tworzTablice();
//        String result="";
//        char[] w = zaszyfrowanaWiadomosc.toCharArray();
//        char[] k = klucz.toCharArray();
//        int kolumna;
//        int wiersz;
//
//
//    }

    public static void main(String[] args) {
        System.out.println(generujWiadomosc("TO JEST BARDZO TAJNY TEKST","NT OJES TBARDZ OTAJN YTEKS"));
        System.out.println(generujWiadomosc("GH XNWL UBRUCN HTJWL RXOCL","NT OJES TBARDZ OTAJN YTEKS"));
    }

}
