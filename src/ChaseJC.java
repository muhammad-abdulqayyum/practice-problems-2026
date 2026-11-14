import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChaseJC {

    // long string, of 10000 words, each separated by a space.
    // count frequency of each word, words can be duplicated in string
    // give top 3 words of highest frequency.

    public static void main(String[] args){

    }

    public static List<String> findThreeHighestWords(String longString){

        List<String> solution = new ArrayList<>();

        // 5,2,1 - NEXTVAL:  - 4

        String[] stringArray = longString.split(" "); //0 - 9999

        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < stringArray.length; i++){
            String word = stringArray[i];

            if(!wordMap.containsKey(word)){
                wordMap.put(word, 1);
            } else {
                Integer currentWordCount = wordMap.get(word);
                currentWordCount++;
                wordMap.put(word, currentWordCount);
            }

        }

        for(Map.Entry<String,Integer> entry : wordMap.entrySet()){
            // word:count
        }

        return solution;
    }

}
