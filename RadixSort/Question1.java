package RadixSort; //radix straight sort

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{8, 3, 5, 4, 7, 3, 2};
        int[] secondArray = new int[]{98, 23, 45, 14, 67, 33, 42};
        int[] thirdArray = new int[]{298, 123, 45, 4, 17, 333, 42};
        System.out.print("Before sorting: ");
        printArray(firstArray);
        radixStraightSort(firstArray, firstArray.length);
        System.out.print("After sorting(Straight Radix Sort): ");
        printArray(firstArray);

        System.out.print("Before sorting: ");
        printArray(secondArray);
        radixStraightSort(secondArray,secondArray.length);
        System.out.print("After sorting(Straight Radix Sort): ");
        printArray(secondArray);

        System.out.print("Before sorting: ");
        printArray(thirdArray);
        radixStraightSort(thirdArray,thirdArray.length);
        System.out.print("After sorting(Straight Radix Sort): ");
        printArray(thirdArray);
    }
    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println(" ");
    }
    public static void radixStraightSort(int[] myArray,int n){
        int m = getMax(myArray,n); //get largest number and know number of digits
        for(int exp=1;m/exp>0;exp*=10)
        {
            countSort(myArray,n,exp);
        }
    }
    public static void countSort(int[] myArray,int n,int exp) {
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count,0);

        //number of occurences
        for(int i=0;i<n;i++)
        {
            count[(myArray[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++)
        {
            count[i] +=count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            output[count[(myArray[i]/exp)%10]-1] = myArray[i];
            count[(myArray[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++)
        {
            myArray[i] = output[i];
        }
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
/*Implement the radix exchange and straight radix sorting algorithms, and sort each of
the following arrays of decimal numbers by calling each of the two methods:
8, 3, 5, 4, 7, 3, 2
98, 23, 45, 14, 67, 33, 42
298, 123, 45, 4, 17, 333, 42
Note that you are required to work with decimal digits for the sorting (range 10, from
0 to 9). To obtain the digit of interest, you can use division and remainder as follows:
x / digitvalue % 10, where x is the number of interest and digitvalue represents
unit, tenth, hundredth, etc. For example,
298/1 % 10 = 8
298/10 % 10 = 9
298/100 % 10 = 2
298/1000 % 10 = 0 */