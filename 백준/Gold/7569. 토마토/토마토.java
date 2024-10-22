import java.io.*;
import java.util.*;

class Main {
    static int[][][] map;
    static int H,M,N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1,-1, 0, 0};
        int[] dh = {1, -1};

        int answer = 0;

        Queue<int[]> q = new LinkedList<>();
        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<M; j++){
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                    if(map[k][i][j] == 1){
                        q.offer(new int[]{k ,i, j, 0});
                    }
                }
            }
        }


        while(!q.isEmpty()){

            int[] pos = q.poll();

            answer = Math.max(answer, pos[3]);
            for(int i=0; i<4; i++){
                int h = pos[0];
                int my = pos[1] + dy[i];
                int mx = pos[2] + dx[i];

                if (isValid(h, my, mx) && map[h][my][mx] == 0) {
                    map[h][my][mx] = 1;
                    q.offer(new int[]{h ,my, mx, pos[3]+1});
                }
            }

            for(int i=0; i<2; i++){
                int mh = pos[0] + dh[i];
                int y = pos[1];
                int x = pos[2];
                if (isValid(mh, y, x) && map[mh][y][x] == 0) {
                    map[mh][y][x] = 1;
                    q.offer(new int[]{mh ,y, x, pos[3]+1});
                }
            }
        }

        boolean flag = true;

        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(map[k][i][j] == 0){
                        flag = false;
                        break;
                    }
                }
            }
        }


        if(flag){
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }

        br.close();
    }

    static boolean isValid(int h,int n, int m) {
        return h >= 0 && n >= 0 && m >= 0 && n < N && m < M && h < H;
    }
}