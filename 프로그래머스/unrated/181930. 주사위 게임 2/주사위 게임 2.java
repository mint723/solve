class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a==b && b==c) {
			answer = (a+a+a)*((a*a)+(a*a)+(a*a))*((a*a*a)+(a*a*a)+(a*a*a));
		}
		else if(a!=b && b==c) {
			answer = (a+b+c)*((a*a)+(b*b)+(c*c));
		}
		else if(b!=a && a==c) {
			answer = (a+b+c)*((b*b)+(a*a)+(c*c));
		}
		else if(c!=b && a==b) {
			answer = (a+b+c)*((c*c)+(a*a)+(b*b));
		}
		else {
			answer = a+b+c;
		}
        return answer;
    }
}