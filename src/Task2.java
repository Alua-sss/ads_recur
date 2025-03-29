import java.util.Scanner;

/**
 * This program calculates the average of n numbers.
 *
 * Time complexity: O(n) — we loop through the array once to sum.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        float average = calculateAverageNum(arr);
        double endTime = System.nanoTime();

        System.out.println("Average: " + average);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000 + " ms");
    }
/**
       * This section calculates the average value of the numbers in the array.
       *
       * The algorithm adds all the elements in the array,
       * then divides the sum by the number of elements.
       * Time Complexity: O (n) because each element counts once.
       *
       * @param arr-list of numbers (array)
       * @return-average value (in float form)
 */
    public static float calculateAverageNum(int[] arr) {
        float sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}
