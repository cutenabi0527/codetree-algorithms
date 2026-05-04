import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int x, y, idx;

		public Point(int x, int y, int idx) {
			this.x = x;
			this.y = y;
			this.idx = idx;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		
		Point[] pt = new Point[n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			pt[i]=new Point(Integer.parseInt(st.nextToken()), 
							Integer.parseInt(st.nextToken()),
							i+1);
		}
		
		Arrays.sort(pt, Comparator.comparingInt((Point p)-> (Math.abs(p.x)+Math.abs(p.y))));
		
		for (Point p : pt) {
			sb.append(p.idx).append("\n");
		}
		
	
		System.out.println(sb);
	}

}
