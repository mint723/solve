class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(check(nums[i],nums[j],nums[k])){
                       answer++;
                    }
                }
            }
        }
        

        return answer;
    }
    
    static boolean check(int i, int j, int k){
        int sum = i+j+k;
        int num = 0;
        for (int l = 1; l <= sum; l++) {
            if(sum%l==0){
                num++;
            }
        }
        if(num==2){
            return true;
        }
        else{
            return false;
        }
    }
}