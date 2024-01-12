import java.util.Scanner;
public class Lab3_2c {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :");
    int a = sc.nextInt();

    boolean temp = false;
    for (int i=2;i<=a/2;i++) {
      if (a%i==0) {
        temp = true;
        break;
      }
    }

    if (!temp){
      System.out.println(a+ " is a prime number.");
    }
    else{
      System.out.println(a+ " is not a prime number.");
    }
  }
}