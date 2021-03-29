package net.acmicpc.baekjoon.step7;

import java.util.Scanner;

//백준 - 7단계(문자열) > 숫자의 합
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum s = new Sum();
		
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(s.solution(n, str));
	}
	
	public int solution(int len, String s) {
		int answer = 0;
		for(int i=0; i<len; i++) {
			answer += Character.getNumericValue(s.charAt(i));
		}
		return answer;
	}
}
