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
    	star(1);
    }
	private static void star(int i) {
		if (i==n+1) return;
		for (int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
		star(i+1);
		
	}

}