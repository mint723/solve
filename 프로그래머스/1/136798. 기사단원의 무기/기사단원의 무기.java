class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=2; i<=number; i++){
            int count = 0;
            
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j ==0){
                    if(j==i/j){
                        count++;
                    }else{
                        count+=2;
                    }
                }
            }
            if(count>limit) count = power;
            answer+=count;
        }
        return answer+1;
    }
}