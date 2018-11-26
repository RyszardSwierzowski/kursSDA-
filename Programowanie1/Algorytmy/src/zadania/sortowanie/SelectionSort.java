package zadania.sortowanie;

import java.util.List;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        int minValue;
        int x=-1;
        for( int i=0;i<input.length;i++){
            minValue=input[i];
            for(int j=i;j<input.length;j++){
                if(input[j]<minValue){
                    minValue=input[j];
                    x=j;
                }
            }
            input[x]=input[i];
            input[i]=minValue;
        }
        return input;
    }
}
