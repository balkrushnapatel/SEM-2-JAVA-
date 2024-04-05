// import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args) {

        
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = 2;
            for (int i = 0; i <= y; i++) {
                z = z * x;
            }
            System.out.println("x*y = " + z);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is an AIOB Exception");
        } 
        catch (NumberFormatException e) {
            System.out.println("This is a NumberFormat Exception");
        }
        catch(ArithmeticException e){
            System.out.println("This is an Arithimatic Exception");
        }
        catch(InputMismatchException e){
            System.out.println("This is an InputMismatch Exception");
        }
    }
}
