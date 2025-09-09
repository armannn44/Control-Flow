import java.util.Scanner;
// Program to compute sum of numbers until user enters 0
class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }
        System.out.println("The total sum is: " + total);
        input.close();
    }
}