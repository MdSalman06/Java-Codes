import java.util.*;

public class EvenIndexElements{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for(int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }
}
