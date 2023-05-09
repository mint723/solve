import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ex = sc.next();
		int answer = 0;
		if (ex.length()==1) {
			answer = 1;
		}
		else {
			for (int i = 0; i < ex.length()/2; i++) {
				if (ex.charAt(i)==ex.charAt(ex.length()-i-1)) {
					answer++;
				}
			}
        
		    if (ex.length()==0) {
				answer = 0;
			}
			else {
			answer = (answer/(ex.length()/2)==1)?1:0;		
			}
         }
		System.out.println(answer);
    }
}

