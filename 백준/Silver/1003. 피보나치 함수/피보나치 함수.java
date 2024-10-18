import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[Math.max(2,N)];
        int max = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            max = Math.max(max,num);
            arr[i] = num;
        }
        
        int[][] fibo = new int[max+2][2];
        fibo[0][0] = 1;
        fibo[0][1] = 0;
        
        fibo[1][0] = 0;
        fibo[1][1] = 1;
        for(int i=2; i<=max+1; i++){
            fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
            fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
        }
        
        for(int i=0; i<N; i++){
            int num = arr[i];
            System.out.println(fibo[num][0] + " " + fibo[num][1]);
        }
        
        br.close();
    }
}