import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            sb.append("IO");
        }
        sb.append("I");

        String P = new String(sb);

        int idx = 0;

        int len = P.length();

        while (idx<=M - len){
            if(S.substring(idx, len+idx).equals(P)){
                answer++;
                idx += 2;
            }else{
                idx++;
            }
        }

        System.out.println(answer);
        br.close();
    }
}