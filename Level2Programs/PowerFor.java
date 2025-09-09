import java.util.Scanner;

// Program to compute power of a number using for loop
class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + "^" + power + " = " + result);
        } else {
            System.out.println("Please enter non-negative integers.");
        }

        input.close();
    }
}