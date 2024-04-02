

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        String tmp = Integer.toString(n,3);
        for(int i=tmp.length()-1; i>=0; i--){
            sb.append(tmp.charAt(i));
        }
        int answer = Integer.parseInt(sb.toString(),3);
        return answer;
    }
}