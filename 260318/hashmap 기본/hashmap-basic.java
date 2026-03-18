import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key, value = 0;
        Map <Integer, Integer> map =new HashMap<>();
        for (int i=0; i<n; i++) {
        	String order = sc.next();
        	if (order.equals("add")) {
        		key = sc.nextInt();
        		value = sc.nextInt();
        	} else {
        		key = sc.nextInt();
        	}
        	
        	if (order.equals("add")) {
        		map.put(key, value);
        	}else if (order.equals("remove")) {
        		map.remove(key);
        	}else if (order.equals("find")) {
        		if (map.containsKey(key)) System.out.println(map.get(key));
        		else System.out.println("None");
        	}
        	
        }
        
        
    }
}