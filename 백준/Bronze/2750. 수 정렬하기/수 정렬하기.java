import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        int n = Integer.parseInt(lines);
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort((a, b) -> a - b);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        br.close();
    }
}