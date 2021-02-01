package net.acmicpc.baekjoon.step5;

import java.util.*;

// 백준 1차원배열 8958 OX퀴즈

public class OxQuiz {
	public static void main(String[] args) {
//		5
//		OOXXOXXOOO       -> 10
//		OOXXOOXXOO       -> 9
//		OXOXOXOXOXOXOX   -> 7
//		OOOOOOOOOO       -> 55
//		OOOOXOOOOXOOOOX  -> 30
		Scanner sc = new Scanner(System.in);
		OxQuiz o = new OxQuiz();
		
		String[] inputArr = new String[sc.nextInt()];
		
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = sc.next();
		}
		for(int i=0; i<inputArr.length; i++) {
			System.out.println(o.solution(inputArr[i]));
		}
		
	}
	
	public int solution(String input) {
		int answer = 0;
		int cnt = 0;
		
//		char[] arr = input.toCharArray();
//		
//		for(int i=0; i<input.length(); i++) {
//			if(arr[i] == 'O') {
//				cnt++;
//			} else {
//				cnt = 0;
//			}
//			answer += cnt;
//		}
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'O') 
				cnt++;
			else
				cnt = 0;
			answer += cnt;
		}
		
		return answer;
	}
}
