package zadania.sortowanie;

/*
1 Napisz metodę do znalezienia środkowego elementu w tablicy
     (gdy parzysta liczba elementów np. 6 wtedy indeks 2, gdy nieparzysta np. 7 wtedy indeks 3)
2 Napisz metodę do wypisywania elementów z tablicy od początku do indeksu a.
3 Napisz metodę do wypisywania elementów z tablicy od indeksu b do końca.
*/
public class zadaniaStr8 {

    private static int zad1(Integer[] tab){
        if(tab.length%2==0){
            return tab[(tab.length/2)-1];
        }else{
            return tab[(tab.length/2)];
        }
    }
    private static void zad2(Integer[] tab , int a){
        if(a<0||tab.length<a){
            System.out.println("Błędna wartość parametru a");
        }
        else {
            for(int i=0;i<=a;i++){
                System.out.print(tab[i]+" ");
            }
        }

    }
    private static void zad3(Integer[] tab , int b){
        if(b<0){
            System.out.println("Błędna wartość parametru b");
        }
        else {
            for(int i=b;i<tab.length;i++){
                System.out.print(tab[i]+" ");
            }
        }

    }private static void zad4(Integer[] tab , int a ,int b){
        if(a<0||b<0|| a>b ||a>=tab.length||b>=tab.length){
            System.out.println("Błędna wartość parametru a lub b");
        }
        else {
            for(int i=a;i<=b;i++){
                System.out.print(tab[i]+" ");
            }
        }

    }
    private static int fibo(int n){

        if(n<1){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Integer[] tablica = {1215,15,11,65,16,48};

        //System.out.println(zad1(tablica));
        //zad2(tablica,5);
        //zad3(tablica,2);
        //zad4(tablica,2,2);
        System.out.println(fibo(11));
        System.out.println(fibo(0));
        System.out.println(fibo(1));


    }

}
