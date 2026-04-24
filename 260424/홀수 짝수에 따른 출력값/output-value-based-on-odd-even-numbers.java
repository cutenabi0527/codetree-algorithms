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
    	
    	System.out.println(a(n));
    }
	private static int a(int i) {
		if (i<0) return 0;
		
		if (i%2==0) {
			return a(i-2)+i;
		}else {
			return a(i-2)+i;
		}

	}
}