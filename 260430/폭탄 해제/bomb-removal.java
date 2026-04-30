import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Bomb {
		String dc, lc;
		int t;
		public Bomb(String dc, String lc, int t) {
			this.dc = dc;
			this.lc = lc;
			this.t = t;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Bomb bm = new Bomb(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
		
		System.out.println("code : "+bm.dc);
		System.out.println("color : "+bm.lc);
		System.out.println("second : "+bm.t);
	}

}
