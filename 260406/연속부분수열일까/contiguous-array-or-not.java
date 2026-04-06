import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N1 = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[N1];
		int[] arr2 = new int[N2];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		String ans = "Yes";
		int idx1 = -1;
		int idx2=0;
		for (int i = 0; i < N1; i++) {
			if (arr1[i]==arr2[0]) {
				idx1 = i;
				break;
			}
		}
		while (idx2<N2) {
			if (arr1[idx1]==arr2[idx2]) {
				idx1++;
				idx2++;
			}
			else {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);

		br.close();
	}
}
