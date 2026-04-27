import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		

		System.out.println(a(n));
	}

	private static int a(int idx) {
		if (idx==n+1) {
			return a(idx);
		}
		if (idx==1) return 1;
		if (idx==2) return 2;
		
		return a(idx/3)+a(idx-1);

	}



}
