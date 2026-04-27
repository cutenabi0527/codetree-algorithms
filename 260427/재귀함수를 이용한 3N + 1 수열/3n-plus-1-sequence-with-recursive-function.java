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
		
		a(n);

		System.out.println(cnt);
	}

	private static int a(int num) {
		if (num==1) {
			return cnt;
		}
		
		if (num %2==0) {
			cnt++;
			return a(num/2);
		} else {
			cnt++;
			return a(3*num+1);
		}
		
	}



}
