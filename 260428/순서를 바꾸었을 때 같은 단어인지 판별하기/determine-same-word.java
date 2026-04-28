import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char arr1[] = br.readLine().toCharArray();
		char arr2[] = br.readLine().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean flag = true;
		
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i]!=arr2[i]) {
				flag = false;
				break;
			}
		}
		System.out.println(flag? "Yes" : "No");
		
	}


}