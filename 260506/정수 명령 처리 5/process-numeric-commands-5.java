import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		List<Integer> list =new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			
			switch(cmd) {
			case "push_back":
				int val = Integer.parseInt(st.nextToken());
				list.add(val);
				break;
			case "get":
				int idx = Integer.parseInt(st.nextToken());
				System.out.println(list.get(idx-1));
				break;
			case "size":
				System.out.println(list.size());
				break;
			case "pop_back":
				list.remove(list.size() - 1);
				break;
			}
				
			
		}
		

	}

}
