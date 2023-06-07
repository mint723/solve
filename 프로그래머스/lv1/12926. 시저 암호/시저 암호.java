class Solution {
    public String solution(String s, int n) {
        String answer="";
        for (int i = 0; i < s.length(); i++) {
            char tmp = (char)(s.charAt(i)+n);
            if(s.charAt(i)==' '){
                tmp =' ';
            }
            if(('A'<=s.charAt(i)&&s.charAt(i)<='Z'&&tmp>'Z')||tmp>'z'){
                tmp-=26;
            }
            answer+=tmp;
        }
        return answer;
    }
}