package net.acmicpc.baekjoon.step7;

import java.util.Scanner;

//백준 - 7단계(문자열) > 문자열 반복
public class RepeatString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RepeatString r = new RepeatString();
		
		int n = sc.nextInt(); // 테스트 케이스 갯수
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = r.solution(sc.nextInt(), sc.next());
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
	}
	
	public String solution(int r, String s) {
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<r; j++) {
				answer += s.charAt(i);
			}
		}
		return answer;
	}
}
