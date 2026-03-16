import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <=n; i++) {
        	int star = 2*i-1;
        	int blank = n-i;
        	for (int j=0; j<blank; j++) {
        		System.out.print("  ");
        	}
        	for (int j=0; j<star; j++) {
        		System.out.print("* ");
        	} System.out.println();
    
        }
    }
}