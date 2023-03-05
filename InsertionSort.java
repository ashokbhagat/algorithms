import java.util.Arrays;

public class InsertionSort {

public static void main(String[] args) {
    int[] arr = {5, 2, 4, 6, 1, 3};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
}

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; //4
            int j = i - 1; //1 , a[j]=5
    
            while (j >= 0 && arr[j] > key) { //1>=0 && 5>4
                arr[j + 1] = arr[j]; // 2,5,5,6,1,3
                j = j - 1; //0
            }
            arr[j + 1] = key; //2,5,4,6,1,3
        }
    }
    
    
}


