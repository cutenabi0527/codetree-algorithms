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

        int[][] arr = new int[4][n];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Map<Integer, Integer> map = new HashMap<>();

        // A + B의 모든 합을 저장
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = arr[0][i] + arr[1][j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        long cnt = 0;

        // C + D를 보면서 필요한 A + B 값 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = arr[2][i] + arr[3][j];
                int target = -sum;

                cnt += map.getOrDefault(target, 0);
            }
        }

        System.out.println(cnt);
    }
}