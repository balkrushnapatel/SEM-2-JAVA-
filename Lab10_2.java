import java.io.File;
import java.util.Scanner;

public class Lab10_2 {
    public static void main(String[] args) {
        try {
            File file = new File("./abc.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
