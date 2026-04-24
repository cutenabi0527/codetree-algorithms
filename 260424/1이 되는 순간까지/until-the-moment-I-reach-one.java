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
    	cnt =0;
    	a(n);
    	System.out.println(cnt);
    }
	private static void a(int i) {
		if (i==1) {
			return;
		}
		
		if (i%2==0) {
			i = i/2;
		} else {
			i = i/3;
		}
		cnt++;
		a(i);
	}
}