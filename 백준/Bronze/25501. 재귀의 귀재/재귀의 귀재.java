import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    static int count = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());
        for (int i = 0; i < lines; i++) {
            String tmp = br.readLine();
            System.out.println(isPalindrome(tmp) + " " + count);
            count=1;

        }
        br.close();
    }

    static int recursion(String s, int l, int r){
        if(l>=r) return 1;
        if(s.charAt(l) != s.charAt(r)) return 0;
        count++;
        return recursion(s, l+1, r-1);
    }

    static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}