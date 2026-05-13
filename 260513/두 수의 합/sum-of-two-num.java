import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        Map<Integer, Integer> map = new HashMap<>();
        int [] arr = new int [n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans =0;
        for (int x : arr) {
            int trg = k - x;
            
            ans += map.getOrDefault(trg, 0);
            
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        System.out.println(ans);
        
    }
}