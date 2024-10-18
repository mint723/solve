import java.io.*;
import java.util.*;
/* 
add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
all: S를 {1, 2, ..., 20} 으로 바꾼다.
empty: S를 공집합으로 바꾼다.
*/
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            String cmd = br.readLine();
            if(cmd.startsWith("all")){
                for(int j=1; j<=20; j++){
                    set.add(j);
                }
            }else if(cmd.startsWith("empty")){
                set.clear();
            }else{
                String[] strArr = cmd.split(" ");
                String toDo = strArr[0];
                int x = Integer.parseInt(strArr[1]);
                if(toDo.equals("add")){
                    set.add(x);
                }
                if(toDo.equals("remove")){
                    set.remove(x);
                }
                if(toDo.equals("check")){
                    if(set.contains(x)){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                }
                if(toDo.equals("toggle")){
                    if(set.contains(x)){
                        set.remove(x);
                    }else{
                        set.add(x);
                    }
                }
            }
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
}