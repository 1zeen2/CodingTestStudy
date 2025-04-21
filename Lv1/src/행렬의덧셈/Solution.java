package 행렬의덧셈;

public class Solution {

	public int[][] solution(int[][] arr1, int[][]arr2) {
		
		if (500 < arr1.length || 500 < arr1[0].length
		 || 500 < arr2.length || 500 < arr2[0].length) {
			throw new  IllegalArgumentException("arr1, arr2의 길이는 500을 넘지 않아야 합니다.");
		}
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i <arr1.length; i++) {
					
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		
		return answer;
	}
}