public class Lab4d {
	public static void main(String[] args) {
		int a[]= new int [] {5,6,7,8,9};
		System.out.println("Original Array: ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i] + "");
		}
		System.out.println("Array in reverse order is: ");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i] + "");
		}
	}
}
