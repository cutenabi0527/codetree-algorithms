import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Person {
		String name;
		int height, weight;

	public Person(String name, int height, int weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}

	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		Person [] p = new Person[n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			p[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(p, (a,b) -> Integer.compare(a.height,b.height));
		
		for (Person ps : p) {
			System.out.println(ps.name+" "+ps.height+" "+ps.weight);
		}
	}

}
