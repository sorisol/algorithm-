package net.acmicpc.baekjoon.step6;


//백준 - 6단계(함수) > 셀프넘버
public class SelfNumber {

	public static void main(String[] args) {
		SelfNumber s = new SelfNumber();
		
		// 셀프함수여부
		boolean[] check = new boolean[10001];	// 범위 : 1~10000
		 
		for (int i = 1; i <= 10000; i++){
			int n = s.solution(i);
			System.out.println(n);
			if(n < 10001){	
				check[n] = true;
			}
		}
 
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false 인 인덱스만 출력
				System.out.println(i);
			}
		}
	}
	
	public int solution(int n) {
		int answer = n;
		
		while(n > 0) {
			answer += n %10; // 각 자리의 숫자
			n /= 10;
		}
		
		return answer;
	}
}
