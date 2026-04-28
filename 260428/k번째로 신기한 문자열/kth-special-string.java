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
		int k = Integer.parseInt(st.nextToken());
		String t = st.nextToken();
		
		List<String> dic = new ArrayList<>();
		for (int i=0; i<n; i++) {
			String tmp = br.readLine();
			if (tmp.substring(0, t.length()).equals(t)) {
				dic.add(tmp);
			}
		}
		Collections.sort(dic);
		System.out.println(dic.get(k-1));
		
		
		
	}


}