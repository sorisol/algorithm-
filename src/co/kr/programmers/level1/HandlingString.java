package co.kr.programmers.level1;

public class HandlingString {
	
	public static void main(String[] args) {
		new HandlingString().solution2("a234");
	}
	public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6) {
	        for(int i=0; i<s.length(); i++) {
	            if((int)s.charAt(i) >= 48 && (int)s.charAt(i) <=57)
	            	answer = true;
	            else {
	            	answer = false;
	            	break;
	            }
	        }
        }
        System.out.println(answer);
        return answer;
    }
	
	// 정규표현식 
	// ^     : 시작(매칭이 처음부터 되어야 함)
	// [0-9] : 숫자 0-9
	// {}    : 자릿수
	// $     : 끝(문자열 끝에 매칭되어야 함)
	public boolean solution2(String s) {
		System.out.println(s.matches("^[0-9]{4}|{6}$"));
		return s.matches("^[0-9]{4}|{6}$");
	}
}
