import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num.length(); i++){
            list.add(num.charAt(i)-'0');
        }
        list.sort((a,b) -> b - a);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        br.close();
    }
}