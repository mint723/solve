class Solution {
    public int solution(int num) {
        int answer = calc((long) num,0);
        return answer;
    }
    
    static int calc(long num,int cycle){
        if(cycle==500){
            return -1;
        }

        if(num==1){
            return cycle;
        } else if (num%2==0) {
            return (calc(num/2,cycle+1));
        }
        else{
            return (calc(num*3+1,cycle+1));
        }
    }
}