package net.acmicpc.baekjoon.step6;

import java.util.Scanner;

//백준 - 6단계 > 함수 > 정수N개의 합
public class SumN {
	//Java: long sum(int[] a); (클래스 이름: Test)
//	a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//	리턴값: a에 포함되어 있는 정수 n개의 합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SumN s = new SumN();
		
		int[] a = new int[sc.nextInt()];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(s.solution(a));
		
	}
	
	public long solution(int[] a) {
		long answer = 0;
		for(int i=0; i<a.length; i++) {
			answer += a[i];
		}
		return answer;
	}

}
