package searching;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch.binarySearch(array, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    public int binarySearch(int[] array, int target) {
        int n = array.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int value = array[mid];
            if (value == target) {
                return mid;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


}
