import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("please, write count of numbers: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Numbers: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            /*
             * This section finds the smallest element inside the array.
             *
             * The algorithm takes the first element as the initial minimum,
             * compares with all other elements.
             *
             * Time Complexity: O (n),  because each element of the array is viewed once.
             */

        }
        System.out.println("The minimum number is "+ min);

    }
}