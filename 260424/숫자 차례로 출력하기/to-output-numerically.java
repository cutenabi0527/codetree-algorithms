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
    	
    	A(1);
    	System.out.println();
    	B(n);
    }
	private static void B(int i) {
		if (i==0) return;
		System.out.print(i+" ");
		B(i-1);
		
	}
	private static void A(int i) {
		if (i==n+1) return;
		System.out.print(i+" ");
		A(i+1);
		
	}

}