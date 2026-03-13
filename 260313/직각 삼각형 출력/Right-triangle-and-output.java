import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i=1 ; i<=a;i++) {
			for (int j=0 ; j<2*i-1;j++) {
				System.out.print("*");
				}System.out.println();
			}
		


	}
}
// char a =sc.next().charAt(0);
