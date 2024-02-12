public class Sorter {

    // Main method for testing the selectionSort method
    public static void main(String[] args) {
        int[] myArray = {64, 25, 12, 22, 11};
        selectionSort(myArray);
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] array) {
        selectionSort(array);
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
}
