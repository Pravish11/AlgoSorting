package DivideAndConquer;

public class Question1b {
    public static void main(String[] args) {
        int[] myArray = new int[] { 65, 89, 12, 45, 53 };
        System.out.println("Before sorting");
        printArray(myArray);
        quickSort(myArray, 0, myArray.length);
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
        if (left >= right)
            return;
        int partition = partition(myArray, left, right);

        quickSort(myArray, 0, partition - 1);
        quickSort(myArray, partition + 1, right);
    }

    public static int partition(int[] myArray, int left, int right) {
        int pivot = myArray[left];

        int splitter = left;

        for (int i = left; i < right; i++) {

            if (pivot > myArray[i]) {
                swap(myArray, ++splitter, i);
            }
        }
        swap(myArray, left, splitter);

        return splitter;
    }

    public static void swap(int[] myArray, int i, int j) {
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }
}
