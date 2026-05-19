import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // key   : x좌표
        // value : 해당 x좌표에서 가장 작은 y값
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // x좌표가 처음 나오면 y 저장
            // 이미 나온 x좌표라면 기존 y와 새 y 중 더 작은 값 저장
            map.put(x, Math.min(y, map.getOrDefault(x, Integer.MAX_VALUE)));
        }

        // y값들의 합은 int 범위를 넘을 수 있으므로 long 사용
        long sum = 0;

        for (int y : map.values()) {
            sum += y;
        }

        System.out.println(sum);
    }
}