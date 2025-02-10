package 정수내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
	public long solution(long n) {
		if (n < 1 || 8000000000L < n) {
            throw new IllegalArgumentException("입력값은 1 이상, 8000000000 이하인 자연수만 가능합니다.");
        }
		
//		String str = Long.toString(n);
		String str = n + "";
		
		
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder(new String(arr));
		
		sb.reverse();
		
//		return Long.parseLong(sb.toString());
		return Long.parseLong(sb + "");
	}
}