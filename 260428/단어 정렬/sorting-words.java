import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String [] dic = new String [n];
		
		for (int i=0; i<n; i++) {
			dic[i]=br.readLine();
		}
		
		Arrays.sort(dic);
		
		for (String tmp : dic) {
			System.out.println(tmp);
		}

		
	}



}
