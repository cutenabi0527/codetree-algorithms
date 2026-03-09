import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aA = sc.nextInt();
		char aS = sc.next().charAt(0);
		int bA = sc.nextInt();
		char bS = sc.next().charAt(0);

		if ((aA >= 19 && aS == 'M') || (bA >= 19 && bS == 'M')) {
			System.out.println(1);
		} else
			System.out.println(0);
	}
}