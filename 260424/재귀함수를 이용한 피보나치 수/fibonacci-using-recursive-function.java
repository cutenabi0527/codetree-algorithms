import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	
    	System.out.println(fibo(n));
    }
	private static int fibo(int i) {
		if (i==1) {
			return 1;
		} else if (i==2) {
			return 1;
		}
		
		return  fibo(i-2)+fibo(i-1);
	}
}