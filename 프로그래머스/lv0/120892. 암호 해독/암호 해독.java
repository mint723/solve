class Solution {
    public String solution(String cipher, int code) {
        int tmp = code-1;
        String answer = "";
        for (int i = 0; i < cipher.length()/code; i++) {
            answer+=cipher.charAt(tmp);
            tmp+=code;
        }
        return answer;
    }
}