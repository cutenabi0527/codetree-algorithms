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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            map.put(tmp, map.getOrDefault(tmp, i));
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.printf("%d %d\n", entry.getKey(), entry.getValue() );
        }
        

        
    }
}