import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean reverse;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	reverse = false ;
    	a(n);
    }
	private static void a(int i) {
		if (i==1) {
			reverse = true;
			System.out.print(1+" ");
		}
		if (reverse && i==n+1) return;
		
		System.out.print(i+" ");
		if (reverse) {
			a(i+1);
		} else {
			a(i-1);
		}
	}

}