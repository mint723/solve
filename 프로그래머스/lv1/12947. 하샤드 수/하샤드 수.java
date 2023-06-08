class Solution {
    public boolean solution(int x) {
        String tmp = ""+x;
        int sum = 0;
        for (int i = 0; i < tmp.length(); i++) {
            sum+=tmp.charAt(i)-'0';
        }
        boolean answer = (x%sum==0)?true:false;
        return answer;
    }
}