import java.util.*;
public class Lab2_25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Degree Farenheit");
        
      
      double f = sc.nextDouble();
      System.out.print(f);

      System.out.println("Degree Celcius = ");
      System.out.print((f-32)*5/9.0);
    }
}
