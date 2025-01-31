package x만큼간격이있는n개의숫자;

import java.util.*;

public class Solution {
	public long[] solution(int x, int n) {
		boolean xRange = (x < -10000000 || 10000000 < x);
		boolean nRange = (n < 1 || 1000 < n);
		
		if (xRange || nRange) {
			// 사용자가 쉽게 이해할 수 있도록 예외 출력문 작성
			throw new IllegalArgumentException("첫 번째 숫자는 -100,000,000 이상, 100,000,000 이하의 숫자만 가능하고, "
											 + "두 번째 숫자는 1000 이하의 자연수만 가능합니다");
		}
		
		long[] answer = new long[n];
		
		// 배열을 자동으로 초기화한 후 0번째 인덱스부터 마지막까지 인덱스(n - 1)까지 자동으로 값을 채워줌.
		Arrays.setAll(answer, i -> (long) x * (i + 1)); 
		
		return answer;
	}
}