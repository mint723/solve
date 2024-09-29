// https://leetcode.com/problems/number-of-islands/

class Solution {
    int m, n;
    boolean[][] visited;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    char[][] maps;

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        maps = grid;
        int answer = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(i,j);
                    answer++;
                }
            }
        }
        return answer;
    }

    void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int xPos = x+dx[i];
            int yPos = y+dy[i];

            if(xPos>=0 && yPos>=0 && xPos<m && yPos<n && !visited[xPos][yPos] && maps[xPos][yPos] == '1'){
                dfs(xPos, yPos);
            }
        }
    }
}
