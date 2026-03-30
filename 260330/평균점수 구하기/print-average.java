import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();

		float sum=0;
		float avg=0;
		for (int i=0; i<8; i++) {
			float num = sc.nextFloat();
			sum+= num;
		}
		avg = sum/8;
		System.out.printf("%.1f",avg);
		
	}
}