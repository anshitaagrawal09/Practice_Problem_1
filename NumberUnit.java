import java.util.Scanner;

public class NumberUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number (1, 10, 100, 1000, etc.): ");
        int number = scanner.nextInt();

        // Determine the unit of the number
        switch (number) {
            case 1:
                System.out.println("Unit");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 100:
                System.out.println("Hundred");
                break;
            case 1000:
                System.out.println("Thousand");
                break;
            case 10000:
                System.out.println("Ten Thousand");
                break;
            default:
                System.out.println("Invalid number or unit not defined.");
        }

        // Close the scanner
        scanner.close();
    }
}