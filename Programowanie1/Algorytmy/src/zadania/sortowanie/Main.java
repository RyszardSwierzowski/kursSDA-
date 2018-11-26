package zadania.sortowanie;

public class Main {
    public static void main(String[] args) {
        Integer[] tablica = {1215,15,11,65,16,48,16};
        SearchAlgorithm sA = new WyszukiwanieLiniowe();
        int result = sA.search(5,tablica);
    }
}
