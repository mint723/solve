import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> memo = new HashMap<>();
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pw = st.nextToken();
            memo.put(site, pw);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<M; i++){
            String site = br.readLine();
            String pw = memo.get(site);
            sb.append(pw);
            if(i!=M-1){
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
        
        br.close();
    }
}