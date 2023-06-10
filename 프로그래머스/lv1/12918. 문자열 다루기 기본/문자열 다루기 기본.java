class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            int tmp = 0;
            for (int i = 0; i < s.length(); i++) {
                if(('A'<=s.charAt(i)&&s.charAt(i)<='Z')||('a'<=s.charAt(i)&&s.charAt(i)<='z')){
                    answer=false;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}