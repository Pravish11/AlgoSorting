package DivideAndConquer;

public class Question2b {
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
        int i=left,j=right;
        int mid = (left+right)/2;
        int x = findMedian(left, mid, right);
        swap(myArray, x, right);
        int pivot = myArray[right];
        while(i<j)
        {
            while (myArray[i]<pivot)
            {
                i++;
            }
            while ((i<j) && (myArray[j]>=pivot))
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
    public static int findMedian(int left,int mid,int right)
    {
        return ((left+mid+right)/3);
    }
}
