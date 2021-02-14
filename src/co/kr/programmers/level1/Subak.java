package co.kr.programmers.level1;

import java.awt.image.BufferedImage;

public class Subak {
	public static void main(String[] args) {
		new Subak().solution(3);
	}
	
	public String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
        	if(i%2 == 1) {
        		answer += "수";
        	} else {
        		answer += "박";
        	}
        }
        System.out.println(answer);
        return answer;
    }
}
