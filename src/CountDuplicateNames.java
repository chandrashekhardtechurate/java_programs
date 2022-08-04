import java.util.*;

public class CountDuplicateNames {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String line = null;
        int count = 0;
        System.out.println("Enter some names ");
        while ((line = in.nextLine()).length() > 0) {
            list.add(line);
            count++;
        }
        countFrequencies(list);
    }

    public static void countFrequencies(ArrayList<String> list) {
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }
}

