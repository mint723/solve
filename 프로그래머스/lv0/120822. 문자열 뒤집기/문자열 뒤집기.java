class Solution {
    public String solution(String my_string) {
        char[] tmpArr = my_string.toCharArray();
        for (int i = 0; i < tmpArr.length/2; i++) {
            char tmp = tmpArr[tmpArr.length-1-i];
            tmpArr[tmpArr.length-1-i]= tmpArr[i];
            tmpArr[i]=tmp;
        }
        String answer = new String(tmpArr);
        return answer;
    }
}