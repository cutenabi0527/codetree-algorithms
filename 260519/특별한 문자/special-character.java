import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char tmp = word.charAt(i);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }
        boolean check = false;
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int frq = entry.getValue();
            char ch = entry.getKey();
            if (frq==1) {
                check = true;
                list.add(ch);
            }
        }
        if(check) {
            for (int i = 0; i < word.length(); i++) {
                for (int j=0; j<list.size(); j++) {
                    if (word.charAt(i)==list.get(j)) {
                        System.out.println(word.charAt(i));
                        return;
                    }
                }
            }
        } else {
            System.out.println("None");
        }
    }
}