import java.util.Scanner;
public class Lab3_2a {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String or a Number :");
    String s1 = sc.next();
    String reverseStr = "";
    
    
    int strLength = s1.length();

    for (int i=(strLength-1); i>=0; i--) {
      reverseStr = reverseStr + s1.charAt(i);
    }

    if (s1.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(s1 + " is a Palindrome String.");
    }
    else {
      System.out.println(s1 + " is not a Palindrome String.");
    }
  }
}