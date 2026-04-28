import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		arr = new int [2*n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<2*n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int ans = 0;
		for (int i=0; i<n/2; i++) {
			ans = Math.max(ans, arr[i]+arr[2*n-1-i]);
		}
		System.out.println(ans);

	}


}