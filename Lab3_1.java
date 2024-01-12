import java.util.Scanner;
public class Lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in 1st subject: ");
        double a = sc.nextDouble();
        System.out.println("Enter marks obtained in 2nd subject: ");
        double b = sc.nextDouble();
        System.out.println("Enter marks obtained in 3rd subject: ");
        double c = sc.nextDouble();
        System.out.println("Enter marks obtained in 4th subject: ");
        double d = sc.nextDouble();
        System.out.println("Enter marks obtained in 5th subject: ");
        double e = sc.nextDouble();
        double pt;
        pt = (((a+b+c+d+e)*100)/500);
        System.out.println(pt);
        if(pt>=60){
            System.out.println("The student has obtained A-Division");
        }
        else if(pt>=50 && pt<=59){
            System.out.println("The student has obtained B-Division");
        }
        else if(pt>=40 && pt<=49){
            System.out.println("The student has obtained C-Division");
        }
        else if(pt<40){
            System.out.println("The student has been Failed");
        }

    }
}
