import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the reverseNumber function and print the result
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}
