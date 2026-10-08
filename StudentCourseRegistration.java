import java.util.Scanner;
class Student {
    String studentName, courseName;
    int rollNumber, courseCredits;
    double marks;
    Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    double calculateFee() {
        return courseCredits * 1500;
    }
    boolean checkEligibility() {
        return marks >= 50;
    }
    double calculateScholarship() {
        if (marks >= 85) return calculateFee() * 0.20;
        if (marks >= 70) return calculateFee() * 0.10;
        return 0;
    }
    double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }
    void displayDetails() {
        System.out.println("Student Name   : " + studentName);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Course Credits : " + courseCredits);
        System.out.println("Eligibility    : " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Total Fee      : Rs. " + calculateFee());
        System.out.println("Scholarship    : Rs. " + calculateScholarship());
        System.out.println("Final Fee      : Rs. " + calculateFinalFee());
    }
}
public class StudentCourseRegistration {
    static Student readStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter course name: ");
        String course = sc.nextLine();
        System.out.print("Enter course credits: ");
        int credits = sc.nextInt();
        return new Student(name, roll, marks, course, credits);
    }
    static void register(Student s) {
        if (s.checkEligibility())
            s.displayDetails();
        else
            System.out.println("Not eligible for registration (marks below 50).");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        register(readStudent(sc));
        sc.close();
    }
}