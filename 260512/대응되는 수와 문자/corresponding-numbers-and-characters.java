import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] word = new String[n+1];    // 숫자 -> 문자 검색용 (Map에서 value로 key를 찾지 못하므로) 
        HashMap<String, Integer> map = new HashMap<>();    // 문자 -> 숫자 검색용
       
        for (int i = 1; i <= n; i++)  {
            String str = br.readLine();
            word[i] = str;
            map.put(str, i);
        }
        
        for (int i=0; i<m; i++) {
            String str = br.readLine();
            
            if (Character.isDigit(str.charAt(0))) {
                int num = Integer.parseInt(str);
                System.out.println(word[num]);
            }else {
                System.out.println(map.get(str));
            }
            
        }
        
    }
}