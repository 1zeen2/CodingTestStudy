package 나누어떨어지는숫자배열;

import java.util.*;

public class Solution {
	
	public static int[] solution(int[] arr, int div) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % div == 0) {
				aList.add(arr[i]);
			}
		}
		
		if (aList.size() == 0) {
			return new int[] {-1};
		}
		
		return aList.stream().mapToInt(i -> i).sorted().toArray();
	}
}