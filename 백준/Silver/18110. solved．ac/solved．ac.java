import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int std = (int) Math.round(n*0.3/2);

        int sum = 0;

        for (int i = std; i < n-std; i++) {
            sum+=arr[i];
        }

        System.out.println((int)Math.round(1.0*sum/(n-(std*2))));
        br.close();
    }
}