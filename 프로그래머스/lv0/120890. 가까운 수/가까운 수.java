class Solution {
    public int solution(int[] array, int n) {
        int answer = 101;
        int diff = 101;
        for (int i = 0; i < array.length; i++) {
            int tmp = (array[i]-n>=0)?array[i]-n : (array[i]-n)*-1;
            if(tmp==diff){
                if(answer>array[i]){
                    answer=array[i];
                }
            }
            else if(tmp<diff){
                answer = array[i];
                diff=tmp;
            }
        }
        return answer;
    }
}