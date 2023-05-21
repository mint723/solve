class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        answer = sol(answer,n,0,0);
        return answer;
    }
     public static int[][] sol(int[][] answer, int n, int cycle,int lastNum){
        for (int i = 0; i < n-1; i++) {
            answer[answer.length-n-cycle][answer.length-n+i-cycle] = lastNum+i+1;

            answer[answer.length-n+i-cycle][answer.length-1-cycle]= lastNum+i+n;

            answer[answer.length-1-cycle][n-1-i+cycle] =lastNum+ (n-1)+n+i;

            answer[answer.length-1-i-cycle][answer.length-n-cycle] = lastNum+(n-1)+(n-1)+n+i;
            if(i==n-2){
                lastNum+=(n-1)+(n-1)+n+i;
            }
        }
        if(n==2){
            return answer;
        }
        else if(n==1){
            answer[answer.length/2][answer.length/2]=lastNum+1;
            return answer;
        }
        else{
            return sol(answer,n-2,cycle+1,lastNum);
        }
    }
}
