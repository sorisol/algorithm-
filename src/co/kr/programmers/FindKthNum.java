package co.kr.programmers;

import java.util.Arrays;

public class FindKthNum {

	public static void main(String[] args) {
		// 테스트 케이스
		// 입력  [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
		// 출력  [5, 6, 3]
		FindKthNum f = new FindKthNum();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];

		answer = f.solution(array, commands);
		
		System.out.println(Arrays.toString(answer));
	}

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
        	int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
