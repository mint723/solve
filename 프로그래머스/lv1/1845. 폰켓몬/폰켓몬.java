import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> result = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                result.put(nums[i],nums[j]);
            }
        }
        int answer = (result.size()> nums.length/2)? nums.length/2 : result.size(); 
        return answer;
    }
}