package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {12, 11, 13, 5, 6};
        selectionSort.selectionSort(array);
        System.out.println("Sorted array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
