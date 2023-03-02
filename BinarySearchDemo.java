public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,11,17};
        
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(16, arr));
         
        
    }
}

class BinarySearch {

    public boolean search(int value, int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == value) {
                System.out.println(value + " Value found at position " + mid);
                found = true;
                break;
            } else {
                if (value > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        if(!found){
            System.out.println(value + " not found" );
        }

        return found;
    }

}