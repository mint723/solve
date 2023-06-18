import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int block = board[j][moves[i]-1];
                if(block!=0){
                    if(!stack.isEmpty() && stack.peek()==block){
                        stack.pop();
                        board[j][moves[i]-1]=0;
                        answer+=2;
                        break;
                    }else{
                        stack.push(block);
                        board[j][moves[i]-1]=0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}