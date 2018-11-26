package zadania.sortowanie;

import java.util.List;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        int temp;
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-1;j++){
                if(input[j] > input[j+1]){
                    temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;

                }
            }
        }
        return input;
    }
    public Integer[] sortV2(Integer[] input) {
        int temp;
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-1-i;j++){
                if(input[j] > input[j+1]){
                    temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;

                }
            }
        }
        return input;
    }
}
