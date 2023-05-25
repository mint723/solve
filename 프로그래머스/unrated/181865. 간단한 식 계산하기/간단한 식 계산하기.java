class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[]biArr = binomial.split("\\s");
        switch (biArr[1]){
            case "+":
                answer = Integer.parseInt(biArr[0])+Integer.parseInt(biArr[2]);
                break;
            case "-":
                answer = Integer.parseInt(biArr[0])-Integer.parseInt(biArr[2]);
                break;
            case "*":
                answer = Integer.parseInt(biArr[0])*Integer.parseInt(biArr[2]);
        }
        return answer;
    }
}