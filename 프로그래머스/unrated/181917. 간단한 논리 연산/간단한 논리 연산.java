class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer=and(or(x1,x2),or(x3,x4));
        return answer;
    }
    
    static boolean or(boolean x1, boolean x2){
		if(x1!=true && x2!=true) {
			return false;
		}
		else {
			return true;
		}
	}
	
	static boolean and(boolean x1, boolean x2) {
		if(x1==true && x2==true) {
			return true;
		}
		else {
			return false;
		}
	}
}