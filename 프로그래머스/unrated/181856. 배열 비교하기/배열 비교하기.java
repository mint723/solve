class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = compare(arr1,arr2);
        return answer;
    }
    static int compare(int[] arr1, int[] arr2){
        if(arr1.length==arr2.length){
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                num1+=arr1[i];
                num2+=arr2[i];
            }
            if(num1==num2){
                return 0;
            } else if (num1>num2) {
                return 1;
            }
            else{
                return -1;
            }

        }
        else if (arr1.length>arr2.length){
            return 1;
        }

        return -1;
    }
}