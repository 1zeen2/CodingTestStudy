package x만큼간격이있는n개의숫자;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 문제의 출력이 [n, 2n, 3n, ...] 방식이기 때문에 문자열로 출력.
		System.out.println(Arrays.toString(sol.solution(13, 5)));
		
		long[] result = sol.solution(13, 5);
		
		// 배열 안의 값만 출력하려고 하는 경우를 가정한 출력 코드 
/*
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			
			// 마지막 index에는 공백을 추가하지 않음.
			if (i < result.length - 1) {
				System.out.print(" ");
			}
		}
*/
	}
}