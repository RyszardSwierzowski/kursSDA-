package zadania.sortowanie.zadaniaStr15;

/*
1. Napisz metodę do zamiany elementów tablicy miejscami
2. Napisz metodę wypisującą wartości w tablicy razem z numerem indeksu. Przykład:
    [0:123, 1:22, 2:98]
3. Napisz metodę która będzie wypisywać zawartość tablicy w tylu wierszach ile posiada
        elementów. Przykład:
                    [0:43, 1:56, 2:11]
                    [0:43, 1:56, 2:11]
                    [0:43, 1:56, 2:11]
4. Zmodyfikuj kod z powyższego zadania tak aby w każdej linii element który znajduje się
    początkowo pod indeksem 0 przesuwał się o jedno miejsce w prawo. Przykład:
                    [0:43, 1:56, 2:11]
                    [0:56, 1:43, 2:11]
                    [0:56, 1:11, 2:43]
 */
public class Zadania
{
    public static void zad1(int[] tab, int indexA, int indexB){
        int a=tab[indexA];

        tab[indexA]=tab[indexB];
        tab[indexB]=a;


//        for(int i=indexA; i<tab.length;i++){
//            a=tab[i];
//            b=tab[i+1];
//        }

    }
    public static void zad2(int[] tab){
        for(int i=0;i<tab.length;i++){
            System.out.print(i+":"+tab[i]+ "  ");
        }
    }
    public static void zad3(int[] tab){
        for(int i=0;i<tab.length;i++){
            zad2(tab);
            System.out.println();
        }
    }
    public static void zad4(int[] tab){

        for(int i=0;i<tab.length;i++){
            if(i>0){
                System.out.println();
                zad1(tab,i-1,i);
                zad2(tab);
            }else{
                zad2(tab);
            }
        }

    }

    public static void main(String[] args) {
        int[] tablica= {43,56,11};
        //zad2(tablica);
        //zad3(tablica);
        //zad4(tablica);

    }
}
