import java.io.*;
import java.util.*;

class Main {
    static int[][] map;
    static boolean[][] visited;
    static int N,M;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        int[] startPos = new int[3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){
                    startPos[0] = i;
                    startPos[1] = j;
                    map[i][j] = 0;
                }
            }
        }

        int[] dy = {0,0,-1,1};
        int[] dx = {1,-1,0,0};

        Queue<int[]> q = new LinkedList<>();
        q.offer(startPos);
        visited[startPos[0]][startPos[1]] = true;

        while (!q.isEmpty()) {
            int[] pos = q.poll();

            for (int i = 0; i < 4; i++) {
                int ny = pos[0] + dy[i];
                int nx = pos[1] + dx[i];

                if(isValid(ny, nx)){
                    q.offer(new int[]{ny,nx, pos[2] + 1});
                    visited[ny][nx] = true;
                    map[ny][nx] = pos[2] + 1;
                }
            }
        }

        // 원래 갈 수 있는 땅인 부분 중에서 도달할 수 없는 위치
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 1 && !visited[i][j]){
                    map[i][j] = -1;
                }
                sb.append(map[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static boolean isValid(int ny, int nx) {
        return (0<=ny && ny<N && 0<=nx && nx<M && !visited[ny][nx] && map[ny][nx] == 1);
    }
}