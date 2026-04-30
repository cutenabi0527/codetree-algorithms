import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Broadcast {
		String date, day, weather;

		public Broadcast() {
		}

		public Broadcast(String date, String day, String weather) {
			this.date = date;
			this.day = day;
			this.weather = weather;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		Broadcast[] bc = new Broadcast[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			bc[i] = new Broadcast(st.nextToken(), st.nextToken(), st.nextToken());
		}

		Broadcast answer = null;

		for (Broadcast b : bc) {
			if (b.weather.equals("Rain")) {
				if (answer == null||answer.date.compareTo(b.date) > 0)
				answer=b;
			}
		}

		System.out.println(answer.date + " " + answer.day + " " + answer.weather);
	}

}
