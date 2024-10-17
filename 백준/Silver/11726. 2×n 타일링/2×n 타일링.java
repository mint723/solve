import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[Math.max(2,N)];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2; i<N; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }
        
        System.out.println(arr[N-1]);
        
        br.close();
    }
}