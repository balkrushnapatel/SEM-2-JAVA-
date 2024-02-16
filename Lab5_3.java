import java.util.Scanner;

class Ask{
    public static int a,e,i,o,u;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = new String();
        int ta=0,te=0,ti=0,to=0,tu=0;
        while(true){
            
            System.out.println("Enter a Line :-");
            s = in.nextLine();
            if(s.equals("quit")){
                break;
            }
            else{
                for(int i=0;i<=s.length();i++){
                    char c=s.charAt(i);
                    if(c=='a')
                    {
                        ta++;
                    }
                    if(c=='e')
                    {
                        te++;
                    }
                    if(c=='i')
                    {
                        ti++;
                    }
                    if(c=='o')
                    {
                        to++;
                    }
                    if(c=='u')
                    {
                        tu++;
                    }
                }
               
        }
        
    }
    System.out.println("a comes"+ta+"times");
    System.out.println("e comes"+te+"times");
    System.out.println("i comes"+ti+"times");
    System.out.println("o comes"+to+"times");
    System.out.println("u comes"+tu+"times");
}
}
