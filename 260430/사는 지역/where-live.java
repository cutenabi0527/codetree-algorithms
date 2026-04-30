import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Living {
		String name;
		String number;
		String location;

	public Living(String name, String number, String location) {
			this.name = name;
			this.number = number;
			this.location = location;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		Living [] lv = new Living[n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			lv[i] = new Living(st.nextToken(), st.nextToken(), st.nextToken());
		}
		
		Living answer = lv[0];
		
		for (int i=0; i<n; i++) {
			if (lv[i].name.compareTo(answer.name)>0) {
				answer = lv[i];
			}
		}
		System.out.println("name " + answer.name);
        System.out.println("addr " + answer.number);
        System.out.println("city " + answer.location);
	}
		

}
