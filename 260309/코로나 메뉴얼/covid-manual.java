import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
	String check;
	int tmp;

	Person(String check, int tmp) {
		this.check = check;
		this.tmp = tmp;
	}
	
	boolean isA() {
		return check.equals("Y")&&tmp>=37;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		for (int i = 0; i < 3; i++) {
			Person p = new Person(sc.next(), sc.nextInt());
			if (p.isA()) cnt++;
		}
		System.out.println(cnt>=2 ? "E" : "N");

	}

}