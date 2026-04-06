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
		
		String arr1 = br.readLine().replace(" ", "");
		String arr2 = br.readLine().replace(" ", "");
		
		if (arr1.length()<arr2.length()){
			String temp = arr1;
			arr1 = arr2;
			arr2 = temp;
		}
		boolean find = false;
		for (int i=0; i<arr1.length()-arr2.length()+1;i++) {
			if (arr2.equals(arr1.substring(i, i+arr2.length()))) {
				find = true;
				break;
			}
		}
		System.out.println(find ? "Yes" : "No");
		
		br.close();
	}
}
