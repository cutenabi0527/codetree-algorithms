import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int k = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                map.put(k, v);   // 있으면 덮어쓰기, 없으면 추가
            } 
            else if (cmd.equals("remove")) {
                int k = Integer.parseInt(st.nextToken());
                map.remove(k);
            } 
            else if (cmd.equals("find")) {
                int k = Integer.parseInt(st.nextToken());
                if (map.containsKey(k)) {
                    sb.append(map.get(k)).append('\n');
                } else {
                    sb.append("None").append('\n');
                }
            }
        }

        System.out.print(sb);
    }
}