import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        int num = Integer.parseInt(lines);
        System.out.println(factorial(num));
        br.close();
    }

    static long factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}