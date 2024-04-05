import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Lab10_1 {
    public static void main(String[] args){
        try {
            FileInputStream f = new FileInputStream("./abc.txt");
            int line = 0;
            int count = 0;
            while ((line = f.read())!= -1) {
                System.out.println((char)line);
                count++;
            }
            
            System.out.println(count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}