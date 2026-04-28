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
		
		int[] arr1 = new int [n];
		int[] arr2 = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean flag = true;
		for (int i=0; i<n; i++) {
			int a = arr1[i];
			int b = arr2[i];
			if (a!=b) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag? "Yes" : "No");

		
	}



}
