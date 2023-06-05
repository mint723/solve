class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        answer[(num-1)/2] = total/num;
        int minus_count = 1;
        int plus_count = 1;
        for (int i = ((num-1)/2)-1; i >= 0; i--) {
            answer[i]= (total/num)-minus_count;
            minus_count++;
        }
        for (int i = ((num-1)/2)+1; i < num; i++) {
            answer[i]=(total/num)+plus_count;
            plus_count++;
        }
        return answer;
    }
}