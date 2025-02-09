import java.util.*;
import java.io.*;

class Main {
    static int N,M;
    static int answer = 0;
    static List<Integer>[] adjList;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adjList = new List[N];
        visited = new boolean[N];

        for(int i=0; i<N; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            adjList[from].add(to);
            adjList[to].add(from);
        }

        for(int i=0; i<N; i++){
            visited[i] = true;
            dfs(i, 0);
            visited[i] = false;
        }

        System.out.println(answer);
        br.close();
    }

    static void dfs(int n, int depth){
        if(depth == 4){
            answer = 1;
            return;
        }

        if(answer != 0){
            return;
        }

        for(int friend : adjList[n]){
            if(visited[friend])
                continue;
            visited[friend] = true;
            dfs(friend, depth+1);
            visited[friend] = false;
        }
    }
}
