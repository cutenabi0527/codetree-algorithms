import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int num, bf, af;

		public Point(int num, int bf, int af) {
			this.num = num;
			this.bf = bf;
			this.af = af;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		
		Point[] pt = new Point[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			pt[i]=new Point(Integer.parseInt(st.nextToken()), 
							i+1,
							0);
		}
		
		Arrays.sort(pt, Comparator.comparingInt((Point p)-> p.num));
		
		for (int i=0; i<n; i++) {
			pt[i].af=i+1;
		}
		Arrays.sort(pt, Comparator.comparingInt((Point p)-> p.bf));
		
		for(Point p : pt) {
			sb.append(p.af+" ");
		}
		
		System.out.println(sb);
	}

}
