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
       
    }
}
