import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Product {
		String pn;
		int pc;
		
		public Product() {
			this.pn = "codetree";
			this.pc = 50;
		}
		
		public Product(String pn, int pc) {
			this.pn = pn;
			this.pc = pc;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Product pd = new Product();
		
		System.out.println("product "+pd.pc+" is "+pd.pn);
		
		Product pd2 = new Product(st.nextToken(), Integer.parseInt(st.nextToken()));
		
		System.out.println("product "+pd2.pc+" is "+pd2.pn);
	}

}
