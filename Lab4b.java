public class Lab4b {

  public static void main(String[] args) {
    String line = "This is Darshan University.";
    int vowels = 0, consonants = 0;

    
    for (int i=0; i<line.length();i++) {
      char ch = line.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      }

      else if ((ch >= 'a' && ch <= 'z')) {
        consonants++;
      }
      
      
      
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    
  }
}
