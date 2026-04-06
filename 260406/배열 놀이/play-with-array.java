import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int queryType = Integer.parseInt(st.nextToken());

            if (queryType == 1) {
                int a = Integer.parseInt(st.nextToken());
                System.out.println(arr[a]);
            } else if (queryType == 2) {
            	int idx = 0;
                int b = Integer.parseInt(st.nextToken());
                for (int j =1; j<Q; j++ ) {
                	if (arr[j]==b) idx = j;
                }
                System.out.println(idx);
            } else if (queryType == 3) {
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                for (int j=s; j<=e;j++) {
                	System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            
            
        }

        br.close();
	}
	
	
}