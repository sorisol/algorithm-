package net.acmicpc.baekjoon.step6;
import java.util.Scanner;

//백준 - 6단계(함수) > 한수
public class Hansu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;

		for(int i=1; i<=n; i++) {
			if(i < 100) {
				result++;
			} else {
				// 자릿수 쪼개기
				int a = i/100;
				int b = (i % 100) / 10;
				int c = (i % 100) % 10;
				if(a-b == b-c)
					result++;
			}
		}
		System.out.println(result);
	}

}
