package DivideAndConquer; //left pivot

public class Question1a {
    public static void main(String[] args) {
        int[] myArray = new int[]{65,89,12,45,53};
        System.out.println("Before sorting");
        printArray(myArray);
        quickSort(myArray, 0, myArray.length-1);
        System.out.println(" ");
        System.out.println("After sorting");
        printArray(myArray);
    }
    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println(" ");
    }
    public static void quickSort(int[] myArray,int left,int right) {
        if(right>left)
        {
            int i = partition(myArray, left, right);
            quickSort(myArray, left, i-1);
            quickSort(myArray,i+1,right);
        }
    }
    public static int partition(int[] myArray,int left,int right)
    {
        int pivot = myArray[right],i=left,j=right;
        while (i<j)
        {
            while (myArray[i]<pivot)
            {
                i++;
            }
            while ((i<j)&&(myArray[j]>=pivot))
            {
                j--;
            }
            if(i<j)
            {
                swap(myArray, i, j);
            }
            else
            {
                swap(myArray, i, right);
            }
        }
        return i;
    }
    public static void swap(int[] myArray,int i,int j)
    {
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }
}
/*
 * Implement the basic quicksort algorithm to sort numeric/alphabetic keys using
 * the:
 * a. Rightmost element
 * b. Leftmost element
 * as the pivot (partitioning element). Your output should show the intermediate
 * partitions created
 * during the sorting process.
 */
