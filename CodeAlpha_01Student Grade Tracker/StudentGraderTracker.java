import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    double grade;

    Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
}
public class StudentGraderTracker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();


        // Taking Student Details
        for(int i = 0; i< n; i++){
            System.out.println("\nEnter details of Student" + (i + 1));

            System.out.println("Enter student name: ");
            String name = sc.nextLine();

            System.out.println("Enter student grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, grade));
        }
        double total = 0;
        double highest = students.get(0).grade;
        double lowest = students.get(0).grade;

        String highestStudent = students.get(0).name;
        String lowestStudent = students.get(0).name;

        // Calculate average , highest and lowest
        for(Student s : students){
            total += s.grade;

            if(s.grade > highest){
                highest = s.grade;
                highestStudent = s.name;
            }
            if(s.grade < lowest){
                lowest = s.grade;
                lowestStudent = s.name;
            }
        }
        double average = total / students.size();

        // Display Report
        System.out.println("\n========== Student Grade Report ==========");

        for(Student s : students){
            System.out.println("Name:" + s.name +
                            " | Grade: " + s.grade);                   
            
        }
        System.out.printf("\nAverage Score: %.2f\n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Highest Scorer: " + highestStudent);

        System.out.println("Lowest Score: " + lowest);
        System.out.println("Lowest Scorer: " + lowestStudent);


        sc.close();

    }
}
