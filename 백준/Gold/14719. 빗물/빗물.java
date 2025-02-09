import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[W];
        for(int i=0; i<W; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(arr[j] != 0){
                    stack.add(j);
                    arr[j] -= 1;
                }
            }

            if(stack.size()>1){
                int lastIdx = stack.pop();
                while(!stack.isEmpty()){
                    int n = stack.pop();
                    answer += lastIdx - n - 1;
                    lastIdx = n;
                }
            }else{
                stack.clear();
            }
        }

        System.out.println(answer);
        br.close();
    }
}
