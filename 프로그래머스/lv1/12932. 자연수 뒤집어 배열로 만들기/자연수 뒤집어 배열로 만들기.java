class Solution {
    public int[] solution(long n) {
        String tmp = ""+n;
        int[] answer = new int[tmp.length()];
        int num = 0;
        for(int i=tmp.length()-1; i>=0; i--){
            answer[num] = tmp.charAt(i)-'0';
            num++;
        }
        return answer;
    }
}