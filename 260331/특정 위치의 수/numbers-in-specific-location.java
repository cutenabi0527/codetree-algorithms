import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int [] arr = new int [11];
		for (int i=1; i<=10; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(arr[3]+arr[5]+arr[10]);
	}
}