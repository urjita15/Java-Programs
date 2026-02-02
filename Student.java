import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int[] marks = new int[5];
    private double average;
    private char grade;

    Student() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public void calculateAverage() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        average = total / 5.0;
    }

    public void calculateGrade() {
        if (average >= 75)
            grade = 'A';
        else if (average >= 50)
            grade = 'B';
        else
            grade = 'C';
    }

    public void display() {
        System.out.println("\nStudent Result");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Student s = new Student();
        s.calculateAverage();
        s.calculateGrade();
        s.display();
    }
}
