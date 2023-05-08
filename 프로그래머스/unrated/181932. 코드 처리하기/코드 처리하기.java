class Solution {
    public String solution(String code) {
        char[] codeArr = code.toCharArray();
		String ret = "";
		int mode = 0;
        for (int i = 0; i < codeArr.length; i++) {
			if (mode == 0) {
				if (codeArr[i]=='1') mode = (mode==0?1:0);
				if (i%2==0 && codeArr[i]!='1') ret+=codeArr[i];
				
			}
			else if (mode == 1) {
				if (codeArr[i]=='1') mode = (mode==0?1:0);
				if (i%2==1 && codeArr[i]!='1') ret += codeArr[i];
			}
			
		}
		if (ret == "") ret = "EMPTY";
        return ret;
    }
}