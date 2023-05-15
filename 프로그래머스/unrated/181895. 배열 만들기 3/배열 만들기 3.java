class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] result = new int[(intervals[0][1]-intervals[0][0]+1)+(intervals[1][1]-intervals[1][0]+1)];
		int cycle = 0;
		for (int i = 0; i < intervals.length; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				result[cycle] = arr[j];
				cycle++;
			}
		}
        return result;
    }
}