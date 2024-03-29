import java.util.Arrays;
import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            String[] Subject = {"Subject1", "Subject2", "Subject3", "Subject4", "Subject5"};
            int[] Marks = new int[Subject.length];
        for (int i = 0; i < Subject.length; i++) {
            int mark;
            do {
                System.out.print("Enter the " + Subject[i] + " Marks : ");
                mark = sc.nextInt();
                if (mark > 100) {
                    System.out.println("Enter a valid marks (0-100).");
                }
            } while (mark > 100);

            Marks[i] = mark;
        }
            double avg = Arrays.stream(Marks).average().getAsDouble();
            System.out.println("Sum of Marks : " + Arrays.stream(Marks).sum());
            System.out.printf("Average Marks : %.2f%n", avg);
            if (avg >= 91 && avg <= 100) {
                System.out.println("Grade A");
            } else if (avg >= 81 && avg < 91) {
                System.out.println("Grade B");
            } else if (avg >= 71 && avg < 81) {
                System.out.println("Grade C");
            } else if (avg >= 61 && avg < 71) {
                System.out.println("Grade D");
            } else if (avg >= 51 && avg < 61) {
                System.out.println("Grade E");
            } else {
                System.out.println("Failed");
            }
        }
    }
