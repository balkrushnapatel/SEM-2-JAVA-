import java.util.Scanner;
public class Lab3_2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter The Second Number : ");
        double b = sc.nextDouble();
        System.out.println("Enter The Third Number : ");
        double c = sc.nextDouble();

        if(a>b && a>c){
            System.out.println("First Number is Largest");
        }
        else if(b>a && b>c){
            System.out.println("Second Number is Largest");
        }
        else{
            System.out.println("Third Number is Largest");
        }
    }
}