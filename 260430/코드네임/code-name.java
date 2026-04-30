import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Person {
		String cd;
		int sc;
		
		public Person(String cd, int sc) {
			this.cd = cd;
			this.sc = sc;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Person[] p = new Person[5];
		
		int mn = Integer.MAX_VALUE;
		for (int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			p[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()));
			mn = Math.min(mn, p[i].sc);
		}
		for (Person pr : p) {
			if (pr.sc==mn) {
				System.out.println(pr.cd+" "+pr.sc);
			}
		}
	}

}
