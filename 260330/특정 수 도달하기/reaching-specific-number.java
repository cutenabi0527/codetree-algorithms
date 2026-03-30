import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int [] arr = new int [10];
		
		int sum=0;
		float avg=0;
		int idx=0;
		for (int i=0; i<10; i++) {
			int num = sc.nextInt();
			if (num>=250) break;
			arr[i]= num;
			idx=i;
			
		}
		for (int j=0; j<=idx; j++) {
			sum+=arr[j];
		}
		avg =  (float)sum/(idx+1);
	
		System.out.printf("%d %.1f", sum, avg);

	}
}