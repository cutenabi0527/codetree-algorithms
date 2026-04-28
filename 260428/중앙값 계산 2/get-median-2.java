import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		List<Integer> arr = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
			if (i%2!=0) {
				Collections.sort(arr);
				System.out.print(arr.get(i/2)+" ");
			}
		}
		
	}


}