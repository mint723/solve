class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                for(int k=0; k<8; k++){
                    if(board[i][j] == 1){
                        if(i+dx[k]>=0 && i+dx[k]<=board.length-1 && j+dy[k]>=0 && j+dy[k]<=board[0].length-1){
                            if(board[i+dx[k]][j+dy[k]] != 1){
                                board[i+dx[k]][j+dy[k]] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}