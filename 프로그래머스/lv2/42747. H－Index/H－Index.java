class Solution {
    public int solution(int[] citations) {
        int answer = 1;
        int h=0;
        
        for (int i = 0; i < citations.length; i++) {
			// if(answer==h) {
			// 	System.out.println(answer+" "+h);
			// }
			answer=0;
			for (int j = 0; j < citations.length; j++) {
				if (citations[j]>=h) {
					answer++;
				}
			}
			if(h<answer) {
				h++;
			}
		}
        return answer;
    }
}