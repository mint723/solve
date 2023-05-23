class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.equalsIgnoreCase(pat)){
            answer=1;
        }
        else{
            for (int i = 0; i < myString.length()-pat.length(); i++) {
                if (myString.substring(i,i+pat.length()).equalsIgnoreCase(pat)){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}