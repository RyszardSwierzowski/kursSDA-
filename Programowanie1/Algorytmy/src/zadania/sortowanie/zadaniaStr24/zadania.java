package zadania.sortowanie.zadaniaStr24;

/*
        1. Napisz metodę dzielącą tablicę na dwie równe (+/-1) części
        2. Napisz metodę łączącą dwie tablice takiego samego rozmiaru (a1, a2)
        => a1[0], a2[0], a1[1], a2[1], itd.
        3. Napisz metodę łączącą dwie tablice różnych rozmiarów (a1, a2) =>
        a1[0], a2[0], a1[1], a2[1], a1[2], a1[3], itd.
        4. Napisz metodę łącząca dwie posortowane tablice jednakowej wielkości w
        jedną posortowaną (kolejność elementów ustalana podczas łączenia
        tablic - nie używaj metod sortujących na tablicy wynikowej)
        5. Napisz metodę łącząca dwie posortowane tablice różnej wielkości w
        jedną posortowaną (kolejność elementów ustalana podczas łączenia
        tablic - nie używaj metod sortujących na tablicy wynikowej)
 */
public class zadania {
    public static void zad1(int[] tab) {
        int[] t1, t2;
        int ind;
        if (tab.length % 2 == 0) {
            t1 = new int[tab.length / 2];
            t2 = new int[tab.length / 2];
            for (ind = 0; ind < t1.length; ind++) {
                t1[ind] = tab[ind];
            }

            for (int i = ind; i < tab.length; i++) {
                t2[i - t1.length] = tab[ind];
                ind++;
            }

        } else {
            t1 = new int[tab.length / 2];
            t2 = new int[(tab.length / 2) + 1];
            for (ind = 0; ind < t1.length; ind++) {
                t1[ind] = tab[ind];
            }

            for (int i = ind; i < tab.length; i++) {
                t2[i - t1.length] = tab[ind];
                ind++;
            }
        }

        for (int x : t1) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : t2) {
            System.out.print(x + " ");
        }
    }

    public static int[] zad2(int[] tab1, int[] tab2) {
        int[] result = new int[2 * tab1.length];
        int currIndex;

        for (currIndex = 0; currIndex < tab1.length; currIndex++) {
            result[currIndex] = tab1[currIndex];
        }
        for (int i = 0; i < tab1.length; i++) {
            result[currIndex] = tab1[i];
            currIndex++;
        }
        return result;
    }


    public static int[] zad3B(int[] tab1, int[] tab2) {
        int[] result = new int[tab1.length + tab2.length];  // tworze nową tablice o rozmiarze równym sumie tab1.length i tab2.length
        int currentIndexTab1 = 0; // obecny index z którego pobieramy wartość z tab1
        int currentIndexTab2 = 0; // obecny index z którego pobieramy wartość z tab2
        int t1Max = tab1.length - 1; // maksymalny index dla tablicy tab1
        int t2Max = tab2.length - 1; // maksymalny index dla tablicy tab1
        int i; // zmienna

        for (i = 0; i < result.length; i++) {
            if (currentIndexTab1 <= t1Max && currentIndexTab2 <= t2Max) //
            {
                result[i] = tab1[currentIndexTab1];
                i++;
                result[i] = tab2[currentIndexTab2];

                currentIndexTab1++;
                currentIndexTab2++;
            } else if (currentIndexTab1 > t1Max)//
            {
                result[i] = tab2[currentIndexTab2];
                currentIndexTab2++;
            } else {
                result[i] = tab1[currentIndexTab1];
                currentIndexTab1++;
            }

        }
        return result;
    }


    public static int[] zad4(int[] sortedTab1, int[] sortedTab2) {
        int[] result = new int[sortedTab1.length + sortedTab2.length];
        int currentIndexTab1 = 0;
        int currentIndexTab2 = 0;
        int t1Max = sortedTab1.length - 1;
        int t2Max = sortedTab2.length - 1;
        int i;


        for (i = 0; i < result.length; i++) {
            if (currentIndexTab1 <= t1Max && currentIndexTab2 <= t2Max) // JEŚLI cT1 oraz cT2 są mniejsze niż ich tab.length
            {

                if (sortedTab1[currentIndexTab1] < sortedTab2[currentIndexTab2]) // WARTOŚĆ Z TAB1 < TAB2
                {
                    result[i] = sortedTab1[currentIndexTab1];
                    currentIndexTab1++;
                } else {
                    result[i] = sortedTab2[currentIndexTab2];
                    currentIndexTab2++;
                }
            } else if (currentIndexTab1 > t1Max)// WARTOŚĆ cT1 > tab1.length
            {
                result[i] = sortedTab2[currentIndexTab2];
                currentIndexTab2++;
            } else  // WARTOŚĆ cT2 > tab2.length
            {
                result[i] = sortedTab1[currentIndexTab1];
                currentIndexTab1++;
            }
        }


        return result;
    }


    public static void main(String[] args) {
        int[] tablica = {1, 2, 7};
        int[] tablica2 = {18, 156, 966, 9999};
        //zad1(tablica);

        /* // ZADANIE 2
        int[] tabZad2=zad2(tablica,tablica);
        for (int x: tabZad2){System.out.print(x+" ");}
        */
        /*   // ZADANIE 3
        int[] tabZad3A =zad3(tablica,tablica);
        int[] tabZad3B =zad3(tablica,tablica2);
        for(int x:tabZad3A){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:tabZad3B){
            System.out.print(x+" ");
            }
        */
        /* ZADANIE 5
        int[] zad4A = zad4(tablica2, tablica);
        int[] zad4B = zad4(tablica, tablica2);
        for (int x : zad4A) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : zad4B) {
            System.out.print(x + " ");
        }
        */

    }

}
