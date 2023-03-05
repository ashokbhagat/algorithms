import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 9, 3, 5, 61, 0, 5, 6, 7, 2, 8 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }

            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;

        }

    }
}
