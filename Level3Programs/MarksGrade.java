import java.util.Scanner;

// Program to compute percentage, grade, and remarks based on marks
class MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Good)");
        } else if (average >= 50) {
            System.out.println("Grade: C (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        input.close();
    }
}