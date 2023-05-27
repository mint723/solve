class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i]==delete_list[j]){
                    arr[i]=-1;
                    length++;
                }
            }
        }
        int[] answer = new int[arr.length-length];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                answer[n]=arr[i];
                n++;
            }
        }
        return answer;
    }
}