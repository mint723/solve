import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    
    static int[][] map;
    static boolean[][] visited;
    static int count = 0;
    static int[] dx = {1,-1,0,0}; // 오 왼 위 아래
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            count = 0;
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            map = new int[M][N];
            visited = new boolean[M][N];
            
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(map[i][j] == 1 && !visited[i][j]){
                        dfs(i,j);
                        answer++;
                    }
                }
            }
            
            if(count == K){
                System.out.println(answer);
            }
            
        }
        br.close();
    }
    static void dfs(int x, int y){
            visited[x][y] = true;
            for(int i=0; i<4; i++){
                int xPos = x+dx[i];
                int yPos = y+dy[i];
                if(xPos>=0 && yPos>=0 && xPos<map.length && yPos<map[0].length){
                    if(!visited[xPos][yPos] && map[xPos][yPos] == 1){
                        dfs(xPos,yPos);
                    }
                }
            }
            count++;
        }
}