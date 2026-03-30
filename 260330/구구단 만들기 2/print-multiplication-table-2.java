import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        for (int j=2; j<=8; j+=2) {
        	for (int i=b; i>=a; i--) {
        		System.out.printf("%d * %d = %d", i, j, i*j);
        		if (i>a) System.out.print(" / ");
        	} System.out.println();
        }
    }
}