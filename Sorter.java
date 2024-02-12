<<<<<<< HEAD
public class InsertionSort {
    public static void main(String[] args){
        System.out.println("Hello");



    }
    public static void insertionSort(){
        System.out.println("hello2");

    }
    public static void sort(){
        insertionSort();

    }
}
=======
public class Sorter {

    // Main method for testing the selectionSort method
    public static void main(String[] args) {
        int[] myArray = {64, 25, 12, 22, 11};
        selectionSort(myArray);
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
}
>>>>>>> 7d6452d8e4d56191c61d8e91e326276e87dc339b
