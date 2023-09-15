import java.util.Hashtable;
import java.util.Map;

public class DuplicateWords {
    public  static void countDuplicateWords(String sentence){
        sentence = sentence.toLowerCase();
        String regex = "[\\W]+";
        sentence = sentence.replaceAll(regex," ");
        String[] words = sentence.split("\\s+");
        Map<String,Integer> count =  new Hashtable<>();
        for(String word : words){
                if (count.containsKey(word)){
                    count.replace(word,count.get(word)+1);
                }else {
                    count.put(word,1);
                }
        }
        for (String name: count.keySet()){
            System.out.println("Word : " + name + " freq = "+ count.get(name));
        }

    }
}
