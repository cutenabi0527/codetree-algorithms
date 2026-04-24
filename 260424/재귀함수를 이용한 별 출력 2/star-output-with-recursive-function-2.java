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
    	star(n);
    }
	private static void star(int m) {
		if (m==0) return;
		for (int i=0; i<m; i++) {
			System.out.print("* ");
		} System.out.println();
		
		star(m-1);
		
		for (int i=0; i<m; i++) {
			System.out.print("* ");
		} System.out.println();
	}

}