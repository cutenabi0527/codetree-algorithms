import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, cnt;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		System.out.println(a(0));
	}
	private static int a(int idx) {
		if (idx == n-1) {
			return arr[idx];
		}
		return lcm(arr[idx], a(idx+1));

	}
	private static int gcd(int a, int b) {
		if (b ==0) return a;
		return gcd(b, a%b);
	}
	private static int lcm(int a, int b) {
		return a/gcd(a, b)*b;
	}



}
