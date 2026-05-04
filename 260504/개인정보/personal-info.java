import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Student {
		String name;
		int height;
		double weight;
		
		public Student(String name, int height, double weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
//		int n = Integer.parseInt(st.nextToken());
		
		Student [] std = new Student[5];
		
		for (int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			std[i] = new Student(st.nextToken(),
					Integer.parseInt(st.nextToken()), 
					Double.parseDouble(st.nextToken()));
		}
		
		Arrays.sort(std, Comparator.comparing((Student s) -> s.name));
		System.out.println("name");
		for(Student s : std) {
			System.out.println(s.name+" "+s.height+" "+s.weight);
		} System.out.println();
		
		Arrays.sort(std, Comparator.comparing((Student s) -> s.height).reversed());
		System.out.println("height");
		for(Student s : std) {
			System.out.println(s.name+" "+s.height+" "+s.weight);
		}
		
	}

}
