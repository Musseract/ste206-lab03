public class Sorter {

    // Main method for testing the selectionSort method
    public static void main(String[] args) {
        int[] myArray = {64, 25, 12, 22, 11};
        // Call sort with desired sort type
        sort(myArray, "insertionSort"); // or "insertionSort"
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
    

    // SelectionSort method
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void sort(int[] array, String sortType) {
        if ("selectionSort".equals(sortType)) {
            selectionSort(array);
        } else if ("insertionSort".equals(sortType)) {
            insertionSort(array);
        }
    }
}
