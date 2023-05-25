class Solution {
    public int solution(String myString, String pat) {
        String changePat ="";
        pat = pat.replaceAll("A","C").replaceAll("B","A").replaceAll("C","B");
        int answer = 0;
        for (int i = 0; i <= myString.length()-pat.length(); i++) {
            if (myString.substring(i,i+pat.length()).equals(pat)){
                answer=1;
            }
        }
        return answer;
    }
}