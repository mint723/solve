class Solution {
    public int solution(int n) {
        String binaryN = Integer.toBinaryString(n);
        int oneOfN = 0;
        for (int i = 0; i < binaryN.length(); i++) {
            if(binaryN.charAt(i)=='1'){
                oneOfN++;
            }
        }
        int answer = -1;
        while(answer==-1){
            n++;
            String nextBinaryN=Integer.toBinaryString(n);
            int oneOfNextN = 0;
            for (int i = 0; i < nextBinaryN.length(); i++) {
                if(nextBinaryN.charAt(i)=='1'){
                    oneOfNextN++;
                }
            }
            if(oneOfN==oneOfNextN){
                answer = n;
            }
        }
        return answer;
    }
}