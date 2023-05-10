class Solution {
    public String solution(int[] log) {
        String answer = "";
        		for (int i = 0; i < log.length-1; i++) {
			switch (log[i+1]-log[i]) {
			case 1:
				answer += "w";
				break;
			case -1:
				answer += "s";
				break;
			case 10:
				answer += "d";
				break;
			case -10:
				answer += "a";
				break;

			default:
				break;
			}
		}

        return answer;
    }
}