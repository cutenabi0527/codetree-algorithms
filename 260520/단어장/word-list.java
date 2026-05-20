import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        TreeMap<String, Integer> map = new TreeMap<>();
        
        for (int i=1; i<=n; i++) {
            String tmp = br.readLine();
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s %d\n", entry.getKey(), entry.getValue() );
        }
        

        
    }
}