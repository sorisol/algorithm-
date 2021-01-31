package co.kr.programmers.level1;

public class Year2016 {
	public static void main(String[] args) {
		Year2016 y = new Year2016();
		
        //1월 1일은 금요일
        // 1/1 => 금요일
		int a=1, b=1;
		System.out.println(y.solution(a, b));
		
		// 5/24 => 화요일
		a=5; b=24;
		System.out.println(y.solution(a, b));
		
	}
	
	public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        //			   1   2   3   4   5   6   7   8   9   10  11  12
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0; // "일"들을 다 더함
        for(int i=0; i<a-1; i++) {
        	total += month[i];
        }
        // -1이유? 1월1일도 하루지난 걸로 계산됨
        total += b-1;
        
        answer = day[total%7];
        
        return answer;
    }
}
