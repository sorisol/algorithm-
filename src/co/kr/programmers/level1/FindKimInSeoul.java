package co.kr.programmers.level1;

public class FindKimInSeoul {

	public static void main(String[] args) {
		FindKimInSeoul f = new FindKimInSeoul();
		String[] seoul = {"Jane", "Kim"};

		System.out.println(f.solution(seoul));

	}
	
    public String solution(String[] seoul) {
    	int x = 0;
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].contains("Kim")) {
        		x = i;
        	}
        }
        String answer = "김서방은 " + x + "에 있다";
        return answer;
    }
}
