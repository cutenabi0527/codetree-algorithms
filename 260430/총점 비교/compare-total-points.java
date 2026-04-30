import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Student {
		String name;
		int gook, young, soo;
		public Student(String name, int gook, int young, int soo) {
			this.name = name;
			this.gook = gook;
			this.young = young;
			this.soo = soo;
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
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(std, Comparator.comparingInt(s -> s.gook+s.young+s.soo));
		
		for (Student s : std ) {
			System.out.println(s.name+" "+s.gook+" "+s.young+" "+s.soo);
		}
	}
	
}
