// https://leetcode.com/problems/number-of-islands/

import java.util.*;

class Solution {
    //m == row
    //n == col

    public void bfs(int x, int y, char[][] grid, boolean[][] visited, int m, int n){
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] cur_v = queue.poll();
            int cur_x = cur_v[0];
            int cur_y = cur_v[1];
            for(int i=0; i<4; i++){
                int next_x = cur_x + dx[i];
                int next_y = cur_y + dy[i];
                //방문하면 안되는 좌표
                //1. vistied 추가된 좌표
                //2. 없는 좌표
                //3. 물(0)인곳
                if(next_x>=0 && next_x<m && next_y>=0 && next_y<n){
                    if(grid[next_x][next_y] == '1' && visited[next_x][next_y] == false){
                        visited[next_x][next_y] = true;
                        queue.add(new int[]{next_x,next_y});
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int answer = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' &&  visited[i][j] == false ){
                    bfs(i, j, grid, visited, m, n);
                    answer++;
                }
            }
        }
        return answer;
        
    }
}
