import java.util.*;

public class Gradecal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.nextLine();

        System.out.println("enter your id ");
        String id = sc.next();

        sc.nextLine();

        System.out.println("enter your college name");
        String collegename = sc.nextLine();

        System.out.println("enter your Branch");
        String branch = sc.nextLine();

        System.out.println("enter present year & semester");
        String semester = sc.nextLine();

        System.out.println("enter the no of subjects do you have");
        int noOfSubjects = sc.nextInt();

        sc.nextLine();

        String Subjects[] = new String[noOfSubjects];
        double marks[] = new double[noOfSubjects];

        double TotalMarks = 0.0;

        for (int i = 0; i < noOfSubjects; i++) {

            System.out.println("\nsubject " + (i + 1));

            System.out.print("enter the subject name: ");
            Subjects[i] = sc.nextLine();

            System.out.print("enter the marks: ");
            marks[i] = sc.nextDouble();

            sc.nextLine();

            TotalMarks = TotalMarks + marks[i];
        }

        String Grade;

        double percentage = TotalMarks / (double) noOfSubjects;

        if (percentage >= 90) {
            Grade = "A+";
        } else if (percentage >= 80) {
            Grade = "A";
        } else if (percentage >= 70) {
            Grade = "B+";
        } else if (percentage >= 60) {
            Grade = "B";
        } else if (percentage >= 50) {
            Grade = "C+";
        } else if (percentage >= 35) {
            Grade = "D+";
        } else {
            Grade = "FAIL";
        }

        System.out.println("\n=============================");
        System.out.println("    STUDENT PROGRESS CARD");
        System.out.println("=============================");

        System.out.println("------ STUDENT INFORMATION -------");

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College name: " + collegename);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);

        System.out.println("\n----- SUBJECT WISE MARKS -----");

        for (int i = 0; i < noOfSubjects; i++) {
            System.out.println("Subject: " + Subjects[i]);
            System.out.println("Marks: " + marks[i]);
        }

        System.out.println("\nTotal Marks: " + TotalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + Grade);

        sc.close();
    }
}