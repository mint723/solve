class Solution {
    public int solution(int a, int b, int c) {
        int answer = a+b+c;
		if (a==b && b==c) {
			answer = (a+a+a)*((a*a)+(a*a)+(a*a))*((a*a*a)+(a*a*a)+(a*a*a));
		}
		else if((a!=b && b==c)||(b!=a && a==c)||(c!=b && a==b)) {
			answer = (a+b+c)*((a*a)+(b*b)+(c*c));
		}
        return answer;
    }
}