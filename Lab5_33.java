import java.util.Scanner;

class Count_Vowel {
    void count(String str) {
        int ta = 0, te = 0, ti = 0, to = 0, tu = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                ta++;
            }
            if (c == 'e') {
                te++;
            }
            if (c == 'i') {
                ti++;
            }
            if (c == 'o') {
                to++;
            }
            if (c == 'u') {
                tu++;
            }
        }

    }

    void displayVowels(int ta, int te, int ti, int to, int tu) {
        System.out.println("a comes" + ta + "times");
        System.out.println("e comes" + te + "times");
        System.out.println("i comes" + ti + "times");
        System.out.println("o comes" + to + "times");
        System.out.println("u comes" + tu + "times");
    }

}

public class Lab5_33 {
    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        String str = new String();
        while (true) {
            System.out.println("Enter a Line :-");
            str = in.nextLine();
            if (str.equals("quit")) {
                break;
            } else {
                Count_Vowel V = new Count_Vowel();
                V.count(str);
            }

        }

        Count_Vowel V1 = new Count_Vowel();
        V1.displayVowels(int ta, int te, int ti, int to, int tu);
    }
}
