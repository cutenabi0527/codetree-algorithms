import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class Point {
        int x, y, idx, dist;

        public Point(int x, int y, int idx) {
            this.x = x;
            this.y = y;
            this.idx = idx;
            this.dist = Math.abs(x) + Math.abs(y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Point[] pt = new Point[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            pt[i] = new Point(x, y, i + 1);
        }

        Arrays.sort(pt, Comparator.comparingInt((Point p) -> p.dist));

        StringBuilder sb = new StringBuilder();

        for (Point p : pt) {
            sb.append(p.idx).append("\n");
        }

        System.out.print(sb);
    }
}