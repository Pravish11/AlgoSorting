package DivideAndConquer;

public class Question2a {
    public static void main(String[] args) {
        int[] myArray = new int[] { 65, 89, 12, 45, 53, 90 };
        System.out.println("Before sorting");
        printArray(myArray);
        quickSort(myArray, 0, myArray.length - 1);
        System.out.println(" ");
        System.out.println("After sorting");
        printArray(myArray);
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(" ");
    }

    public static void quickSort(int[] myArray, int left, int right) {
        if (right > left) {
            if (myArray.length < 5) {
                insertionSort(myArray);
            } else {
                int i = partition(myArray, left, right);
                quickSort(myArray, left, i - 1);
                quickSort(myArray, i + 1, right);
            }

        }
    }

    public static int partition(int[] myArray, int left, int right) {
        int pivot = myArray[right], i = left, j = right;
        while (i < j) {
            while (myArray[i] < pivot) {
                i++;
            }
            while ((i < j) && (myArray[j] >= pivot)) {
                j--;
            }
            if (i < j) {
                swap(myArray, i, j);
            } else {
                swap(myArray, i, right);
            }
        }
        return i;
    }

    public static void swap(int[] myArray, int i, int j) {
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    public static void insertionSort(int[] myArray) {
        for (int i = 1; i < myArray.length; i++) {
            int key = myArray[i];
            int j = i;
            while ((j > 0) && (myArray[j - 1] > key)) {
                myArray[j] = myArray[j - 1];
                j--;
            }
            myArray[j] = key;
        }
    }
}
/*Implement an improved quicksort algorithm using:
a. Insertion sort for smaller sub-lists (let’s say list of size < 5)
b. Median-of-three method */
