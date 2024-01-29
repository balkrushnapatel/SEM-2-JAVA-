import java.util.Scanner;
    class Lab4e {
        public static void main(String m[]) {

        Scanner sc = new Scanner(System.in);
        String a = new String();
        System.out.println("Enter a String :");
        a=sc.next();
        int l=a.length();
        System.out.println("Length of the string "+a+" is "+l);
        System.out.println("Your sub String is:"+a.substring(l/2));
     }
}
