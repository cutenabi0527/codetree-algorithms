import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Student {
		int h, w, idx;

		public Student(int h, int w, int idx) {
			this.h = h;
			this.w = w;
			this.idx = idx;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		
		Student[] std = new Student[n];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			std[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i+1);
		}
		
		Arrays.sort(std, Comparator.comparingInt((Student s) -> s.h)
									.thenComparing(Comparator.comparingInt((Student s) -> s.w).reversed()));
		
		for (int i=0; i<n; i++) {
			sb.append(std[i].h).append(" ")
			.append(std[i].w).append(" ")
			.append(std[i].idx);
			if (i!=n-1) sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
