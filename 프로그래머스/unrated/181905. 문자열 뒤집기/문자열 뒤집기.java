class Solution {
    public String solution(String my_string, int s, int e) {
        int count=0;
		char[] charArr = my_string.toCharArray();
		for (int i = 0; i < my_string.length(); i++) {
			charArr[i]=my_string.charAt(i);
			System.out.println(charArr[i]); 
		}
        if (e-s==1) {
			char tmp = charArr[s];
			charArr[s]=charArr[e];
			charArr[e]=tmp;
		}
		else {
			for (int i = s; i <= s+((e-s)/2); i++) {
				char tmp;
				tmp = charArr[i];
				charArr[i]=charArr[e-count];
				charArr[e-count]=tmp;
				count++;
			}
		}
		String answer = new String(charArr);
        return answer;
    }
}