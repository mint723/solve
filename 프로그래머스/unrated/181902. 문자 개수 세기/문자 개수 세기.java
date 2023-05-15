class Solution {
    public int[] solution(String my_string) {
        		int[] answer = new int[('Z'-'A'+1)+('z'-'a'+1)];
		for (int i = 0; i < my_string.length(); i++) {
			int num = 0;
			for (int j = 'A'; j <= 'Z'; j++) {
				if(my_string.charAt(i)==j) {
					answer[num]+=1;
				}
				num++;
			}
		}
		for (int i = 0; i < my_string.length(); i++) {
			int num = 26;
			for (int j = 'a'; j <= 'z'; j++) {
				if(my_string.charAt(i)==j) {
					answer[num]+=1;
				}
				num++;
			}
		}

        return answer;
    }
}