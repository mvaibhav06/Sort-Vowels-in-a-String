import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortVowels {
    public static String sortVowels(String s) {
        List<Character> vowels = List.of('a','e','i','o','u','A','E','I','O','U');
        char[] temp = s.toCharArray();
        List<Integer> values = new ArrayList<>();

        for(int i=0; i<temp.length; i++){
            char ch = temp[i];
            if(vowels.contains(ch)){
                values.add((int)ch);
            }
        }

        Collections.sort(values);
        List<Character> abc = new ArrayList<>();
        for(int a: values){
            char c = (char) a;
            abc.add(c);
        }
        int j = 0;
        for(int i=0; i<temp.length; i++){
            char ch = temp[i];
            if(vowels.contains(ch)){
                temp[i] = abc.get(j);
                j++;
            }
        }
        return new String(temp);
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
}
