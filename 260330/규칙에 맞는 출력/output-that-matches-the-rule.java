import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num=1;
		for (int i=0; i<a; i++) {
			for (int j=i; j>=0; j--) {
				System.out.print(a-j+" ");
			} System.out.println();
		}
	}
}