import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        Map<Map, Integer> result = new HashMap<>();
        for (int i=0; i<n; i++) {
            String tmp = br.readLine();
            Map<Character, Integer> map = new HashMap<>(); 
            for (int j=0; j<tmp.length(); j++) {
                char ch = tmp.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            result.put(map, result.getOrDefault(map, 0)+1);
        }
        int mx = 0;
        for (Integer i : result.values()) {
            mx =Math.max(mx, i);
        }
        System.out.println(mx);
    }
}
