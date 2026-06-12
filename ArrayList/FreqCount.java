import java.util.*;

public class FreqCount {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(5);

        int count = 0;

        for(int num : list) {
            if(num == 5)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}
