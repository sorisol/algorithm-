package net.acmicpc.baekjoon.step7;

import java.util.Scanner;

//백준 - 7단계(문자열) > 아스키코드
public class Ascii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ascii a = new Ascii();
		System.out.println(a.solution(sc.next()));
		// a.solution("A");
		// a.solution("a");
	}
	
	public int solution(String s) {
		
		return (int)s.charAt(0);
	}

}
