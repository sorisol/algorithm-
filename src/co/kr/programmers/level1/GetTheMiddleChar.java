package co.kr.programmers.level1;

public class GetTheMiddleChar {

	public static void main(String[] args) {
		GetTheMiddleChar g = new GetTheMiddleChar();
		
		String s = "abcde";
		System.out.println(g.solution(s));
		
		s = "qwer";
		System.out.println(g.solution(s));
		
	}
	public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {
            int start = s.length()/2 - 1;
            System.out.println(start);
            answer = s.substring(start,	start+2);
        } else {
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        
        return answer;
    }
}
