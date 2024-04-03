import java.util.Scanner;

public class Task2GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total subjects:");
        int subjects = sc.nextInt();

        int tMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter Subject "+ i +" marks: ");
            int marks = sc.nextInt();
            tMarks += marks;
        }
        double Percentage = (double) tMarks / subjects;
        char grade;
        if (Percentage >= 90)
        {
            System.out.println("Grade A");
        }
        else if (Percentage >= 80)
        {
            System.out.println("Grade B");
        }
        else if (Percentage >= 70)
        {
            System.out.println("Grade C");
        }
        else if (Percentage >= 60)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
        System.out.println("Total Marks: " + tMarks);
        System.out.println("Average Percentage: " + Percentage + "%");

    }
}