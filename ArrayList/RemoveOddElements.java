import java.util.*;

public class RemoveOddElements{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        list.removeIf(n -> n % 2 != 0);

        System.out.println(list);
    }
}
