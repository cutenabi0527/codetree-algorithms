import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char[] arr = { 'L', 'E', 'B', 'R', 'O', 'S' };
		int idx = -1;
		for (int i = 0; i < 6; i++) {
			if (arr[i]==ch) idx = i;
		}
		
		System.out.println(idx==-1 ? "None": idx);
	}
	
}