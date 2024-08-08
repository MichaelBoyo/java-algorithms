package sorting;

public class QuickSort {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] array = {12, 11, 13, 5, 6};
        quickSort.quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public void quickSort(int[] array, int low, int high){
        if(low < high){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
