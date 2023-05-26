class Solution {
    boolean solution(String s) {
        boolean answer;
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                left++;
            } else if (s.charAt(i)==')'&&left>right) {
                right++;
            }
            else{
                right=100_000_001;
            }
        }
        
        answer = (right==left&&right!=0)?true:false;
        return answer;
    }
}