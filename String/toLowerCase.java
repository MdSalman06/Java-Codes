import java.util.*;

public class toLowerCase{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();
        
        String Lowercase = str.toLowerCase();
        System.out.println("Converted String :"+Lowercase);
    }
}
