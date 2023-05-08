class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] arr = new int[included.length];
		arr[0] = a;
        int answer = (included[0]==true?a:0);
        
        for (int i = 1; i < included.length; i++) {
			arr[i] += arr[i-1]+d;
			if (included[i]==true) {
				answer+=arr[i];
			}
		}
        
        return answer;
    }
}