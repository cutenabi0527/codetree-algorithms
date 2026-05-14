
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static class NumInfo {
        int num, freq;

        public NumInfo(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        List<NumInfo> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        for (int number : map.keySet()) {
            list.add(new NumInfo(number, map.get(number)));
        }

        list.sort(
                Comparator.comparingInt((NumInfo nm) -> nm.freq).reversed()
                          .thenComparing(
                            Comparator.comparingInt((NumInfo nm) -> nm.num).reversed())
            );

        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i).num+" ");
        }
    }
}