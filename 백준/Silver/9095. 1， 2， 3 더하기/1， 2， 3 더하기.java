import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for(int i=4; i<=10; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
       
        for(int i=0; i<T; i++){
           int n = Integer.parseInt(br.readLine());
           sb.append(dp[n]);
           if(i+1!=T)
               sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
