import java.util.Scanner;
public class MinMaxValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to store 5 3-digit numbers
        int[] numbers = new int[5];
        System.out.println("Enter 5 three-digit numbers:");
        // Loop to read 5 3-digit numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            while (numbers[i] < 100 || numbers[i] > 999) {
                System.out.println("Please enter a valid 3-digit number:");
                numbers[i] = sc.nextInt();
            }
        }
        // Initialize min and max with the first value
        int min = numbers[0];
        int max = numbers[0];
        // Loop to find min and max
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        // Output the result
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}