import java.util.Scanner;

public class Lab8_1ext {
    public static void main(String[] args) {

        double c = 1;
        try {

            double a;
            double b;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter value of a :- ");
            a = sc.nextInt();

            System.out.println("Enter value of b:- ");
            b = sc.nextInt();

            c = a / b;

        }

        catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(c);
        }
    }

}
