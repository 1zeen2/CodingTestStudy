package 내적;

import java.util.stream.IntStream;

public class Solution {
	public int solution(int[] a, int[] b) {
		
		if (a.length != b.length || a.length < 1 || 1000 < a.length) {
			throw new IllegalArgumentException("a의 입력 값의 개수와 b의 입력 값의 개수는 같아야 하며 "
											 + "각 입력 값의 개수는 1개 이상 1000개 이하만 가능합니다.");	
		}
		
		if (IntStream.of(a).anyMatch(n -> n < -1000 || 1000 < n) || 
			IntStream.of(b).anyMatch(n -> n < -1000 || 1000 < n)) {
			throw new IllegalArgumentException("각 입력 값의 크기는 -1000 이상, 1000 이하의 정수만 가능합니다.");
		}
		
		return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
	}
}