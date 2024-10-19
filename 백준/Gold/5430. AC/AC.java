import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            Deque<Integer> dq = new ArrayDeque<>();
            char[] cmds = br.readLine().toCharArray();
            int len = Integer.parseInt(br.readLine());
            String s = br.readLine();

            boolean flag = true;
            boolean isError = false;

            if (len > 0) {
                String[] arr = s.substring(1, s.length() - 1).split(",");
                for (int j = 0; j < arr.length; j++) {
                    dq.addLast(Integer.parseInt(arr[j]));
                }
            }

            for(char cmd : cmds){
                if(cmd == 'R'){
                    flag = !flag;
                }else{ // cmd = D
                    if(dq.isEmpty()){
                        isError = true;
                    }else{
                        if(flag){
                            dq.pollFirst();
                        }else{
                            dq.pollLast();
                        }
                    }
                }
            }

            if(isError){
                sb.append("error");
            }else{
                sb.append("[");
                while(!dq.isEmpty()){
                    if(flag){
                        sb.append(dq.pollFirst());
                    }else{
                        sb.append(dq.pollLast());
                    }
                    if(!dq.isEmpty()){
                        sb.append(",");
                    }
                }
                sb.append("]");
            }
            if(i!=T-1){
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}
