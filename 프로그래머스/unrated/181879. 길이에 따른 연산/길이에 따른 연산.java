class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list.length<11){
                answer *= num_list[i];
            }
            else{
                answer+=num_list[i];
            }
        }
        answer = (num_list.length<11)?answer:answer-1;
        return answer;
    }
}