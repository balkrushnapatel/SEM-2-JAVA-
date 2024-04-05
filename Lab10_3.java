import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab10_3 {
    public static void main(String[] args) {
        try {
            File file = new File("./abc.txt");
            Scanner sc = new Scanner(file);
            FileWriter writer = new FileWriter("./cd.txt");
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
                Line = Line.replaceAll("Java", "Patel");
                writer.append(Line);
            }
            sc.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
