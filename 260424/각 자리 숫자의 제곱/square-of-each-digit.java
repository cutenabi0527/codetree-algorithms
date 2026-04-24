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
    	
    	System.out.println(ze(n));
    }
	private static int ze(int i) {
		if (i<10) {
			return i*i; 
		}
		
		int temp =(i%10)*(i%10);
		
		
		return ze(i/10)+ temp;
	}
}