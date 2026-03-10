import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();

		int i=1;
		while (i<=a) {
			String b = String.valueOf(i);
			if (i%3==0||b.contains("3")||b.contains("6")||b.contains("9")) {
				System.out.print(0+" ");
			}else System.out.print(i+" ");
			i++;
		}
	}
}
// char a =sc.next().charAt(0);