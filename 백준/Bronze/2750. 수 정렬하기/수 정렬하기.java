import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        
        for(int number : list){
            System.out.println(number);
        }
        br.close();
    }
}