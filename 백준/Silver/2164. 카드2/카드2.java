import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        int n = Integer.parseInt(lines);
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        boolean flag = true;
        while(queue.size() != 1){
            if(flag){
                queue.poll();
            }else{
                int tmp = queue.poll();
                queue.add(tmp);
            }
            flag = !flag;
        }
        System.out.println(queue.poll());
        br.close();
    }
}