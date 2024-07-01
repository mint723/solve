class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = calc(brown, yellow, 1);
        return answer;
    }
    
    static int[] calc(int brown, int yellow, int line){
        if(yellow%line!=0){
            return calc(brown, yellow, line+1);
        }
        if((yellow/line * 2) + (line*2) + 4 == brown ){
            return new int[]{yellow/line+2, line+2};
        }

        return calc(brown, yellow, line+1);
    }
}