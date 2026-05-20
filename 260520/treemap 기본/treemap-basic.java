import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        TreeMap<Integer, String> map = new TreeMap<>();
        
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("add")) {
                int a = Integer.parseInt(st.nextToken());
                String b = st.nextToken();
                map.put(a, b);
                
            }else if (cmd.equals("find")) {
                int a = Integer.parseInt(st.nextToken());
                System.out.println(map.getOrDefault(a, "None"));
                
            }else if (cmd.equals("remove")) {
                int a = Integer.parseInt(st.nextToken());
                map.remove(a);

            }else if (cmd.equals("print_list")) {
                if (map.isEmpty()) {
                    System.out.println("None");
                } else {
                    for (String val : map.values()) {
                        System.out.print(val+" ");
                    }
                    System.out.println();
                }
            }
            
        }
        
    }
}