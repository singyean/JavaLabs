import java.util.Scanner;
public class recursion {
  public static void main(String[] args) {
    // Create a scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter text: ");
    String text = input.nextLine();

    // Display the reverse string
    System.out.println("The reverse text is " + reverseString(text));
   

   }
    
    public static String reverseString(String text) {
      //implement your case algorithm
      if (text.length() <= 1) 
        return text;
      else 
        return text.charAt(text.length() - 1) + reverseString(text.substring(0, text.length() - 1));
      
    }
      
  
}
    
