import java.util.Scanner;

class Student {

    private String name;
    private int rollNo;
    private double[] marks = new double[5];
    private double average;
    private char grade;

    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        calculateAverage();
        calculateGrade();
    }

    private void calculateAverage() {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        average = sum / 5;
    }

    private void calculateGrade() {
        if (average >= 75) {
            grade = 'A';
        } else if (average >= 50) {
            grade = 'B';
        } else {
            grade = 'C';
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------");
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();

            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextDouble();
            }

            sc.nextLine();

            students[i] = new Student(name, rollNo, marks);
        }

        System.out.println("\n----- Student Results -----");
        for (int i = 0; i < 10; i++) {
            students[i].display();
        }

        sc.close();
    }
}