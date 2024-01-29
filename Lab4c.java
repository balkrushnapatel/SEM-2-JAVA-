public class Lab4c {
 
    public static void main(String[] args) {
 
        int a []={10,20,30,40};
        int sum=0;
        double avg=0;
        for (int i=0; i<a.length;i++) {
            sum=sum+a[i];
            avg=sum/(a.length);
             
        }
        System.out.println("Sum = "+sum+"    Average = "+avg);
    }
}