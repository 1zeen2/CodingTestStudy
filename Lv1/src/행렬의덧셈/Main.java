package 행렬의덧셈;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Solution sol = new  Solution();
		
		System.out.println(Arrays.deepToString(sol.solution(new int [][] {{3, 7}, {7, 5}}, new int [][] {{7, 4}, {2, 2}})));
	}

}