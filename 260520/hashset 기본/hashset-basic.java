import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int val = Integer.parseInt(st.nextToken());
            
            if (cmd.equals("find")) {
                System.out.println(set.contains(val));
            }else if (cmd.equals("add")) {
                set.add(val);
            }else if (cmd.equals("remove")) {
                set.remove(val);
            }
        }
        
        


        
    }
}