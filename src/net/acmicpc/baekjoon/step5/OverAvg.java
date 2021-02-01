package net.acmicpc.baekjoon.step5;

import java.util.Scanner;

// 백준 - 5단계 > 1차원배열 > 평균은넘겠지
public class OverAvg {
	public static void main(String[] args) {
//		5
//		5 50 50 70 80 100
//		7 100 95 90 80 70 60 50
//		3 70 90 80
//		3 70 90 81
//		9 100 99 98 97 96 95 94 93 91
		
		Scanner sc = new Scanner(System.in);
		OverAvg o = new OverAvg();
		
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			int[] arr = new int[sc.nextInt()];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			System.out.println(o.solution(arr));
		}
	}
	
	public String solution(int[] arr) {
		int sum = 0; // 점수 총합
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		float avg = (float)sum/(float)arr.length; // 평균
		
		int cnt = 0; // 평균보다 높은 학생 수
		for(int i=0; i<arr.length; i++) {
			if(avg < arr[i]) {
				cnt++;
			}
		}
		// 평균을 넘는 학생들의 비율
		float ratio = (float)cnt/(float)arr.length * 100;
		// 소수점 셋째 자리 반올림
		String answer = String.format("%.3f%%", ratio);
		
		return answer;
	}
}
