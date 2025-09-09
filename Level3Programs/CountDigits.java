import java.util.Scanner;

// Program to count number of digits in an integer
class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;
        int temp = number;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits in " + number + " = " + count);
        input.close();
    }
}