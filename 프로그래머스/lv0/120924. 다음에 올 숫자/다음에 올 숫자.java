class Solution {
    public int solution(int[] common) {
        int[] progress = new int[2];
        progress[0] = common[1]-common[0];
        progress[1] = common[2]-common[1];
        int answer = 0;
        if(progress[0]==progress[1]){
            answer = common[common.length-1]+progress[0];
        } else{
            int mul = common[1]/common[0];
            answer = common[common.length-1]*mul;
        }
        return answer;
    }
}