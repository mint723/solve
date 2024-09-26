class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for(int i=0; i<=t*m; i++){
            num.append(Integer.toString(i,n));
        }
        String numStr = num.toString().toUpperCase();
        
        for(int i=p-1; i<numStr.length(); i=i+m){
            answer.append(numStr.charAt(i));
            if(answer.toString().length() == t) break;
        }
        return answer.toString();
    }
}