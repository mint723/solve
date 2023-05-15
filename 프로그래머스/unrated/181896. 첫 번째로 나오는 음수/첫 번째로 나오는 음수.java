class Solution {
    public int solution(int[] num_list) {
        int result = 0;
		for (int i = 0; i < num_list.length; i++) {
			if(num_list[i]<0) {
				result = i;
				break;
			}
		}
		result=(num_list[0]>0&&result==0)?-1:result;
        return result;
    }
}