class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] stringArr = new char[my_string.length()];
		for (int i = 0; i < stringArr.length; i++) {
			stringArr[i]=my_string.charAt(i);
		}
		
		for (int i = 0; i < queries.length; i++) {
			char tmp;
			int count = 0;
			if (queries[i][1]-queries[i][0]==1) {
				tmp = stringArr[queries[i][0]];
				stringArr[queries[i][0]]=stringArr[queries[i][1]];
				stringArr[queries[i][1]]=tmp;
			}
			else{
				for (int j = queries[i][0]; j <= queries[i][0]+(queries[i][1]-queries[i][0])/2; j++) {
					tmp = stringArr[j];
					stringArr[j] = stringArr[queries[i][1]-count];
					stringArr[queries[i][1]-count]=tmp;
					count++;
				}
			}
		}
		
		String answer = new String(stringArr);
        return answer;
    }
}