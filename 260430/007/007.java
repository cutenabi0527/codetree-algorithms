import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Mission {
		String sc, mp;
		int t;
		public Mission(String sc, String mp, int t) {
			this.sc = sc;
			this.mp = mp;
			this.t = t;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String sc1 = st.nextToken();
		String mp1 = st.nextToken();
		int t1 = Integer.parseInt(st.nextToken());
		
		Mission ms = new Mission(sc1, mp1, t1);
		
		System.out.println("secret code : "+ ms.sc);
		System.out.println("meeting point : "+ms.mp);
		System.out.println("time : "+ms.t);
		
	}

}
