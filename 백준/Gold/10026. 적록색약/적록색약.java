import java.io.*;
import java.util.*;

public class Main {
    static char[][] map;
    static char[][] cMap;
    static int N;
    static boolean[][] visited;
    static boolean[][] cVisited;
    
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1,-1, 0, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        cMap = new char[N][N];
        visited = new boolean[N][N];
        cVisited = new boolean[N][N];
        
        int answer = 0;
        int cAnswer = 0;
        
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                char alp = line.charAt(j);
                map[i][j] = alp;
                if(line.charAt(j)=='G'){
                    cMap[i][j] = 'R';
                }else{
                    cMap[i][j] = alp;
                }
            }
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    answer++;
                    dfs(new int[]{i,j});
                }
                if(!cVisited[i][j]){
                    cAnswer++;
                    cDfs(new int[]{i,j});
                }
            }
        }
        System.out.print(answer+" "+cAnswer);

        br.close();
    }
    
    static void dfs(int[] pos){
        int x = pos[0];
        int y = pos[1];
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int mx = x+dx[i];
            int my = y+dy[i];
            if(isValid(mx, my) && map[mx][my] == map[x][y] &&!visited[mx][my]){
                dfs(new int[]{mx, my});
            }
        }
    }
    
    static void cDfs(int[] pos){
        int x = pos[0];
        int y = pos[1];
        cVisited[x][y] = true;
        for(int i=0; i<4; i++){
            int mx = x+dx[i];
            int my = y+dy[i];
            if(isValid(mx, my) && cMap[mx][my] == cMap[x][y] &&!cVisited[mx][my]){
                cDfs(new int[]{mx, my});
            }
        }
    }
    
    static boolean isValid(int n, int m) {
        return n >= 0 && m >= 0 && n < N && m < N;
    }
}