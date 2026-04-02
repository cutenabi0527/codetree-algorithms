import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []arr = new int [10];
		for (int i=0; i<a; i++	) {
			arr[sc.nextInt()]++;
		}
		for (int i=1; i<10; i++	) {
			System.out.println(arr[i]);
		}
	}
}
