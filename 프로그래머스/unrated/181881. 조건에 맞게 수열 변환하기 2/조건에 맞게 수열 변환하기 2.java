import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int[] arrX = new int[arr.length];
        int count=-1;
        while(!Arrays.equals(arr, arrX)){
            arrX=arr.clone();
            change(arr);
            count++;
        }
        return count;
    }
    static int[] change(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=50&&arr[i]%2==0){
                arr[i] /= 2;
            } else if(arr[i]<50&&arr[i]%2!=0){
                arr[i] = arr[i]*2+1;
            }
        }
        return arr;
    }
}