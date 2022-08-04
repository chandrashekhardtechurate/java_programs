import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class UniquenamesList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<String>( );
        String line = null;
        System.out.println("Enter some names !");
        while ((line = in.nextLine( )).length( ) > 0){
            list.add(line);
        }
        HashSet<String> hset = new HashSet<String>(list);
        System.out.println(hset);
        }
    }

