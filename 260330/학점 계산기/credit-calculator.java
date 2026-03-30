import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float [] arr = new float [n];
		
		float sum=0;
		float avg=0;
		for (int i=0; i<n; i++) {
			float num = sc.nextFloat();
			arr[i]= num;
		}
		for (int i=0; i<n; i++) {
			sum+=arr[i];
		}
		avg = sum/n;
		System.out.printf("%.1f\n",avg);
		if (avg>=4.0) System.out.print("Perfect");
		else if (avg>=3.0) System.out.print("Good");
		else System.out.print("Poor");
	}
}