import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Status {
		String id;
		int lv;
		public Status() {
			this.id = "codetree";
			this.lv = 10;
		}
		public Status(String id, int lv) {
			this.id = id;
			this.lv = lv;
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Status stt = new Status();
		
		System.out.println("user "+stt.id+" lv "+stt.lv);
		String idd = st.nextToken();
		int lvv = Integer.parseInt(st.nextToken());
		Status stt2 = new Status(idd, lvv);	
		
		System.out.println("user "+stt2.id+" lv "+stt2.lv);
	}

}
