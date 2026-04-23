import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static int[][] map;
    static int[][] ans;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Pos {
        int r, c;

        public Pos(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()); // 문제에 주어지지만, 실제 풀이에는 없어도 됨

        map = new int[n][n];
        ans = new int[n][n];

        Queue<Pos> q = new ArrayDeque<>();

        // 입력을 받으면서
        // 각 칸의 정답 배열(ans)의 초기값을 세팅한다.
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 0) {
                    // 빈 칸은 귤이 없으므로 -1
                    ans[i][j] = -1;
                } else if (map[i][j] == 2) {
                    // 처음부터 상한 귤은 시간 0
                    ans[i][j] = 0;
                    // 멀티 소스 BFS 시작점으로 큐에 즉시 넣음
                    q.offer(new Pos(i, j));
                } else {
                    // 일반 귤(1)은 아직 상한 시간이 미정이므로 -2로 둠
                    ans[i][j] = -2;
                }
            }
        }

        // 멀티 소스 BFS
        // 큐에 들어 있는 모든 시작점(처음 상한 귤들)에서 동시에 퍼져나간다고 생각하면 된다.
        while (!q.isEmpty()) {
            Pos cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                // 격자 밖이면 스킵
                if (!inRange(nr, nc)) continue;

                // 빈 칸이면 퍼질 수 없음
                if (map[nr][nc] == 0) continue;

                // 이미 시간이 정해진 칸이면(이미 먼저 상했거나 시작점이었으면) 스킵
                if (ans[nr][nc] != -2) continue;

                // 아직 안 상한 귤(1)에 처음 도달했다면,
                // 현재 칸 시간 + 1초 후에 상하게 됨
                ans[nr][nc] = ans[cur.r][cur.c] + 1;
                q.offer(new Pos(nr, nc));
            }
        }

        // 정답 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(ans[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static boolean inRange(int r, int c) {
        return r >= 0 && c >= 0 && r < n && c < n;
    }
}