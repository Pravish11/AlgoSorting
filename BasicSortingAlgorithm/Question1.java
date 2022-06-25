package BasicSortingAlgorithm;

import java.util.Scanner;

public class Question1 {
    private static Scanner scanln;
    private static int selection=0,insertion=0,bubble=0;
    public static void main(String[] args) {
        scanln = new Scanner(System.in);
        int choice;
        int[] myArray = new int[5];
        do {
            System.out.println("");
            System.out.println("1. Create an array of integers");
            System.out.println("2. Display elements of the array or integers");
            System.out.println("3. Apply selection sort and display the elements of the sorted array");
            System.out.println("4. Apply insertion sort and display the elements of the sorted array");
            System.out.println("5. Apply bubble sort and display the elements of the sorted array");
            System.out.println("6. Display comparison table of the number of comparisons in each sorting method");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanln.nextInt();
            if (choice == 1) {
                myArray = createArray();
            }

            if (choice == 2) {
                printArray(myArray);
            }
            if (choice == 3){
                selectionSort(myArray);
            }
            if (choice == 4){
                insertionSort(myArray);
            }
            if(choice==5)
            {
                bubbleSort(myArray);
            }
            if(choice==6)
            {
                printComparison();
            }
        } while (choice != 7);

    }
    public static int[] createArray()
    {
        int n;
        System.out.println(" ");
        System.out.print("Enter number of elements: ");
        n = scanln.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number: ");
            myArray[i] = scanln.nextInt();
        }
        return myArray;

    }
    public static void printArray(int[] myArray) {
        System.out.println(" ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
    }
    public static void selectionSort(int[] myArray)
    {
        int[] arr = new int[myArray.length];
        System.arraycopy(myArray, 0, arr, 0, myArray.length);
        for (int i = 0; i < arr.length; i++) {
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min])
                {
                    min =j;
                }
                selection++;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void insertionSort(int[] myArray) {
        int[] arr = new int[myArray.length];
        System.arraycopy(myArray, 0, arr, 0, myArray.length);
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j=i;
            while((j>0)&&(arr[j-1]>key))
            {
                arr[j] = arr[j-1];
                j--;
                insertion++;
            }
            arr[j] = key;
        }
        printArray(arr);
    }
    public static void bubbleSort(int[] myArray)
    {
        int[] arr = new int[myArray.length];
        System.arraycopy(myArray, 0, arr, 0, myArray.length);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                bubble++;
            }
        }
        printArray(arr);
    }
    public static void printComparison(){
        System.out.println(" ");
        System.out.println("Selection sort: "+selection);
        System.out.println("Insertion sort: "+insertion);
        System.out.println("Bubble sort: "+bubble);
        System.out.println(" ");
    }
}
/*
 * Implement the following sorting algorithms to sort an array of integers:
 *  Selection sort
 *  Insertion sort
 *  Bubble sort (improved version)
 * Write a program that provides the user with the following menu:
 * 1. Create an array of integers
 * 2. Display elements of the array or integers
 * 3. Apply selection sort and display the elements of the sorted array
 * 4. Apply insertion sort and display the elements of the sorted array
 * 5. Apply bubble sort and display the elements of the sorted array
 * 6. Display comparison table of the number of comparisons in each sorting
 * method
 * 7. Exit
 * Note: Your sorting methods should copy the contents of the original array
 * into a temporary array and
 * sort the temporary array.
 * System.arraycopy(arrayFrom, 0, arrayTo, 0, arrayFrom.length) can be used to
 * copy all elements of
 * arrayFrom to arrayTo.
 */