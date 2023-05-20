class Solution {
    public int[] solution(String s) {
        char[] sArr = s.toCharArray();
        int[] result = new int[sArr.length];
        result[0] = -1;
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < i; j++) {
                if(sArr[i]==sArr[j]){
                    result[i]=i-j;
                    sArr[j]='*';
                    break;
                }
                else{
                    result[i]=-1;
                }
            }
        }
        return result;
    }
}