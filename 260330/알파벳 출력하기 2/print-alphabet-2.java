import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num=65;
		for (int i = a; i >=1; i--) {
			for (int j=0; j<a-i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) num+" ");
				num++;
				if (num>=91) num=65;
			} System.out.println();
		}
	}
}