class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int num=0;
        if(A.equals(B)){
            answer = 0;
        }
        else{
            for(int i = 0; i<A.length(); i++){
                String tmp = "";
                tmp+=A.charAt(A.length()-1);
                for(int j = 0; j<A.length()-1; j++){
                    tmp+=A.charAt(j);
                }
                A=tmp;

                num++;
                if(A.equals(B)){
                    answer=num;
                    B = "";
                }
            }
        }
        
        return answer;
    }
}