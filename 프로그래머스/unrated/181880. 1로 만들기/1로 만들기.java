class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        int answer = change(num_list,count);
        return answer;
    }
    
    static int change(int[] num_list,int count){
        int temp=0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]==1){

            }
            else if (num_list[i]%2==0){
                num_list[i] /= 2;
                count++;
            }
            else if(num_list[i]%2!=0){
                num_list[i] = (num_list[i]-1)/2;
                count++;
            }
        }
        for (int i = 0; i < num_list.length; i++) {
            temp+=num_list[i];
        }
        if (temp!=num_list.length){
            return change(num_list,count);
        }
        else{
            return count;
        }
    }
}