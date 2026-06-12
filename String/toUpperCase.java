import java.util.*;

public class toUpperCase{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        
        String Uppercase = str.toUpperCase();
        
        System.out.println("Converted String :"+Uppercase);
    }
}
