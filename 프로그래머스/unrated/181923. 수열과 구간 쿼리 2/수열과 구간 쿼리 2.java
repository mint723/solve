class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
		int result = 0;
        for (int i = 0; i < queries.length; i++) {
			int min_result = 1000001;
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (arr[j]>queries[i][2]) {
					min_result = Math.min(arr[j], min_result);
				}
				
			}
			answer[i] = (min_result<1000001)?min_result:-1;
		}
        return answer;
    }
}