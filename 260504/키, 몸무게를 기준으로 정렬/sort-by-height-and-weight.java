import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Student {
		String name;
		int height, weight;
		
		public Student(String name, int height, int weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
		
		
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		Student [] std = new Student[n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			std[i] = new Student(st.nextToken(),
					Integer.parseInt(st.nextToken()), 
					Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(std, Comparator.comparingInt((Student s)->s.height)
									.thenComparing(Comparator.comparingInt((Student s)->s.weight).reversed()));
		
		for(Student s : std) {
			System.out.println(s.name+" "+s.height+" "+s.weight);
		}
		
	}

}
