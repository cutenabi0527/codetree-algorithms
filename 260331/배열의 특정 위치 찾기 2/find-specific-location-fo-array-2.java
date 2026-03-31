import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [11];
		int sumO = 0;
		int sumE = 0;
		for (int i=1; i<=10; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i=1; i<=10; i++) {
			if (i%2!=0) sumO+=arr[i];
			else sumE+=arr[i];
		}
		System.out.println(sumO>sumE ? sumO-sumE:sumE-sumO);
	}
}
