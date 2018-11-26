package zadania.sortowanie;

import java.util.List;

public class WyszukiwanieBinarne  {

    static Integer[] tab = {0,3,4,19,54,1515,68989};


    public Integer search(Integer value, List<Integer> input) {
        return null;
    }


    public static Integer search(Integer value, Integer[] input) {
        int low = 0;
        int high = input.length-1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (tab[mid] > value){
                high = mid - 1;
            }else if (tab[mid] < value){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(4,tab));
        System.out.println(search(2,tab));
    }
}
