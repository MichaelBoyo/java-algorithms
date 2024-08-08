package sorting;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {12, 11, 13, 5, 6};
        mergeSort.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    public void merge(int[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = array[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = array[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

}
