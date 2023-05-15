class Solution {
    public String solution(String my_string, int[] indices) {
        		char[] strArr = new char[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			strArr[i]=my_string.charAt(i);
		}
		
		for (int i = 0; i < indices.length; i++) {
			strArr[indices[i]]=' ';
		}
		String answer = new String(strArr);
		answer = answer.replaceAll(" ", "");
        return answer;
    }
}