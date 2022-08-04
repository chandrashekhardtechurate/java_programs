import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortOnSecondName {
    private static boolean benar;

    public void sortLast(ArrayList<String> al) {
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split(" ");
                String[] split2 = o2.split(" ");
                String lastName1 = split1[1];
                String lastName2 = split2[1];
                if (lastName1.compareTo(lastName2) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(al);
    }

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("bbb ddd");
        al.add("fff aaa");
        al.add("eee bbb");
        al.add("dddd cccc");
        System.out.println("Names before sorting:\n"+al);
        SortOnSecondName i = new SortOnSecondName();
        System.out.println("After Sorted using Last Name:");
        i.sortLast(al);
    }
}


