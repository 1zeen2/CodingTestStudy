package 제일작은수제거하기;

import java.util.*;

public class Solution {
	public static int[] solution(int[] arr) {
		if (arr.length < 1) {
			throw new IllegalArgumentException("입력 값은 최소 1개 이상이어야 합니다.");
		}
		
		int minValue = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
		
		int[] answer = Arrays.stream(arr).filter(num -> num != minValue)
							 .boxed().sorted(Comparator.reverseOrder())
							 .mapToInt(Integer :: intValue)
							 .toArray();
	
		return (answer.length > 0) ? answer : new int[] {-1};
	}
}