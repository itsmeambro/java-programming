package dsa.sorting;

public class InsertionSort implements Sorting{
    @Override
    public int[] sortIntArray(int[] arr) {

        for(int i = 1 ; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }
}
