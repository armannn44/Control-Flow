import java.util.Scanner;

// Program to find all multiples of a number below 100 using for loop
class MultiplesFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input. Must be a positive integer less than 100.");
        }

        input.close();
    }
}