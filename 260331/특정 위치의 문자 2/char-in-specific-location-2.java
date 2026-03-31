import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] arr = new char [11];
		for (int i=1; i<=10; i++) {
			arr[i]=sc.next().charAt(0);
		}
		System.out.printf("%s %s %s",arr[2],arr[5],arr[8] );
	}
}