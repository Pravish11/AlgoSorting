package RadixSort;

public class Question1P2 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{8, 3, 5, 4, 7, 3, 2};
        System.out.print("Before sorting: ");
        printArray(firstArray);
        radixExchangeSort(firstArray, firstArray.length);
        System.out.print("After sorting(Radix Exchange Sort): ");
        printArray(firstArray);

    }
    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println(" ");
    }
    public static void radixExchangeSort(int[] myArray,int n){
        int m = getMax(myArray,n); //get largest number and know number of digits
        System.out.println(m);
    }
    public static int getMax(int[] myArray,int n) {
        int max = myArray[0];
        for(int i=1;i<n;i++)
        {
            if(myArray[i]>max)
            {
                max = myArray[i];
            }
        }
        return max;
    }
}
