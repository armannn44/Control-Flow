import java.util.Scanner;
// Program to compute sum of n natural numbers using for loop and compare with formula
class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        input.close();
    }
}