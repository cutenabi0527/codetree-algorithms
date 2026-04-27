import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, total, sum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		total = 1;
		for (int i=0; i<3; i++) {
			n = Integer.parseInt(st.nextToken());
			total *= n;
		}
		
		System.out.println(findMax(total));
		
	}

	private static int findMax(int t) {
		if (t==0) {
			return t;
		}
		
		return findMax(t/10)+t%10;
		
	}

}
