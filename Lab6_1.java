
//De ne constructor and calculate_spi methods.De ne main to instantiate an array
//for objects of class student to process data of n students to be given as command line arguments.
import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    Student() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID number:- ");
        id_no = sc.nextInt();

        System.out.println("Enter Number of subjects:- ");
        no_of_subjects_registered = sc.nextInt();

        subject_code = new int[no_of_subjects_registered];

        subject_credits = new int[no_of_subjects_registered];

        grade_obtained = new String[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {

            System.out.println("Enter Subject Code:- ");
            subject_code[i] = sc.nextInt();

            System.out.println("Enter Subject Credits:- ");
            subject_credits[i] = sc.nextInt();

            System.out.println("Enter Grades Obtained:- ");
            grade_obtained[i] = sc.next();
        }
    }

    double calculate_spi() {
        // spi = (grade_obtained/no_of_subjects_registered);
        return 0;
    }

}

public class Lab6_1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            s[i].calculate_spi();
        }
    }

}
