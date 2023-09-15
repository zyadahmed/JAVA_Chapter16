import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingWords {
    public static void sortingwords(String line){
        line = line.toLowerCase();
        String[] words = line.split("\\s+");
        SortedSet<String> s=  new TreeSet<>();
        for (String word : words){
            s.add(word);
        }
        for (String word:s){
            System.out.println(word);
        }


    }
}
