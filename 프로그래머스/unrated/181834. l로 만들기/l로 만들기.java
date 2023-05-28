class Solution {
    public String solution(String myString) {
        char[] myStringArr = myString.toCharArray();
        for (int i = 0; i < myStringArr.length ; i++) {
            if(myStringArr[i]<'l'){
                myStringArr[i]='l';
            }
        }

        String answer = new String(myStringArr);
        return answer;
    }
}