import java.util.Scanner;

// Program to find greatest factor of a number (besides itself) using for loop
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        input.close();
    }
}