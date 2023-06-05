class Solution {
    public String solution(int[] food) {
        String answer = "";
        String right = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                answer+=i;
                right+=i;
            }
        }
        answer+="0";
        for (int i = right.length()-1; i >= 0; i--) {
            answer+=right.charAt(i);
        }
        return answer;
    }
}