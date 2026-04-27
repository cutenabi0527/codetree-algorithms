import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, cnt;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		System.out.println(a(0));
	}
	// idx번 원소부터 마지막 원소까지의 최소공배수를 반환하는 함수
	private static int a(int idx) {
		// 마지막 원소 하나만 남았다면
        // 그 구간의 최소공배수는 자기 자신
		if (idx == n-1) {
			return arr[idx];
		}
		// 현재 값 arr[idx]와
        // 뒤쪽 구간의 최소공배수 findLcm(idx + 1)의 최소공배수를 구하기
		return lcm(arr[idx], a(idx+1));

	}
	// 최대공약수(유클리드 호제법). 최소공배수를 구하기 위해 필요
	private static int gcd(int a, int b) {
		if (b ==0) return a;
		return gcd(b, a%b);
	}
	// 최소공배수
	private static int lcm(int a, int b) {
		return a/gcd(a, b)*b;
	}



}
