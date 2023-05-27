class Solution {
    public int[] solution(int[] arr) {
        int k = 0;
        double i = 0;
        while(arr.length>k){
            k=(int)Math.pow(2,i);
            i++;
        }
        int[] answer = new int[k];
        for (int j = 0; j < k; j++) {
            if(j>=arr.length){
                answer[j]=0;
            }else{
                answer[j]=arr[j];
            }
        }
        return answer;
    }
}