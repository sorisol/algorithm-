package net.acmicpc.baekjoon.step7;

import java.util.Scanner;

//백준 - 7단계(문자열) > 단어 공부
public class StudyWord {

	public static void main(String[] args) {
		//Mississipi -> ?
		//zZa ->Z
		//baaa -> A
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
//		String s = input.toUpperCase();
//		
//		int[] alpha = new int[26];
//		int max = 0;
//		char result = '?';
//		for(int i=0; i<s.length(); i++) {
//			
//			alpha[s.charAt(i)-65]++;
//			if(max < alpha[s.charAt(i)-65]) {
//				max = alpha[s.charAt(i)-65];
//				result = s.charAt(i);
//			} else if(max == alpha[s.charAt(i)-65]) {
//				result = '?';
//			}
//		}
//		
//		System.out.println(result);
		StudyWord sw = new StudyWord();
		System.out.println(sw.solution(input));
	}
	
	public char solution(String s) {
		s = s.toUpperCase();
		// 각 알파벳의 갯수를 담을 배열
		int[] alpha = new int[26];
		int max = 0;
		char result = '?';
		
		for(int i=0; i<s.length(); i++) {
			alpha[s.charAt(i)-'A']++;
			
			if(alpha[s.charAt(i)-'A'] > max) {
				max = alpha[s.charAt(i)-'A'];
				result = s.charAt(i);
			} else if(alpha[s.charAt(i)-'A'] == max) {
				result = '?';
			}
		}
		return result;
	}

}
