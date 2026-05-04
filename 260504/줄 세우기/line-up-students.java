import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Student {
		int height, weight, idx;

		public Student(int height, int weight, int idx) {
			this.height = height;
			this.weight = weight;
			this.idx = idx;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		Student [] std = new Student[n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			std[i] = new Student(Integer.parseInt(st.nextToken()), 
								Integer.parseInt(st.nextToken()),
								i+1);
		}
		
		Arrays.sort(std,
				Comparator.comparingInt((Student s) -> s.height).reversed()
							.thenComparing(Comparator.comparingInt((Student s)->s.weight).reversed())
							.thenComparing(Comparator.comparingInt((Student s) -> s.idx)));
		
		for (Student s : std) {
			System.out.println(s.height+" "+s.weight+" "+s.idx);
		}
		

	}

}
