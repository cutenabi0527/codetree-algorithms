import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i= a ; i>=1;i--) {
			for (int j=0 ; j<i;j++) {
				for (int k=0;k<i;k++) {
					System.out.print("*");
				}System.out.print(" ");
			}System.out.println();
		}


	}
}
// char a =sc.next().charAt(0);
