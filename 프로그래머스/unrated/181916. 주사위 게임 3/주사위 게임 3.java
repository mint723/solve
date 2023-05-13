import java.util.ArrayList;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(a);		al.add(b);		al.add(c);		al.add(d);
		al.sort(null);
		a=al.get(0);
		b=al.get(1);
		c=al.get(2);
		d=al.get(3);
		if(a==b&&b==c&&c==d) {
			answer = a*1111;
		}
		else if(a==b&&b==c) {
			answer = (10*a+d)*(10*a+d);
		}
		else if(b==c&&c==d) {
			answer = (10*b+a)*(10*b+a);
		}
		else if(a==b&&c==d) {
			answer = (a+c)*(c-a);
		}
		else if(a==b) {
			answer = c*d;
		}
        else if(b==c) {
			answer = a*d;
		}
		else if(c==d) {
			answer = a*b;
		}
		else {
			answer = a;
		}
        return answer;
    }
}