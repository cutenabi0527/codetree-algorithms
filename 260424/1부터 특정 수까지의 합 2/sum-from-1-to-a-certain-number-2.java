import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, sum;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	sum =0;
    	fac(1);
    	System.out.println(sum);
    }
	private static void fac(int i) {
		if (i==n+1) return;
		sum+=i;
		fac(i+1);
	}
}