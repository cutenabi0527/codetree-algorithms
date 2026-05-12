import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner 대신 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄 입력 (N, M)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        // 두 번째 줄 입력 (수열 데이터)
        HashMap<String, Integer> map = new HashMap<>();
       
        for (int i = 0; i < n; i++)  {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        int mx =Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            mx = Math.max(value, mx);
        }
        System.out.println(mx);
    }
}