import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for(int i=N-1; i>=0; i--){
            if(coins[i]<=K){
                answer += K/coins[i];
                K = K%coins[i];
            }
            if (K == 0) break;
        }
        System.out.println(answer);

        br.close();
    }
}