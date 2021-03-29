package net.acmicpc.baekjoon.step7;

import java.util.Scanner;

//백준 - 7단계(문자열) > 알파벳 찾기
public class FindAlphabet {

	public static void main(String[] args) {
		// 97~122
		Scanner sc = new Scanner(System.in);
		FindAlphabet f = new FindAlphabet();
		
		String s = sc.next();
		f.solution(s);
	}
	
	public void solution(String s) {
		for(int i=(int)'a'; i<=(int)'z'; i++) {
			System.out.print(s.indexOf((char)i)+" ");
		}
	}
}
