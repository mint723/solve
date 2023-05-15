class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
		for (int i = idx; i < arr.length; i++) {
			if(arr[i]==1) {
				answer = i;
                break;
			}
		}
		answer = (answer!=0)?answer:-1;
        if (arr[0]==1&&idx==0) {
			answer = 0;
		}
        return answer;
    }
}