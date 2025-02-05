package 자연수뒤집에배열로만들기;

public class Solution {
	public int[] solution(long n) {
		if (n < 1 || 10000000000L < n) {
			throw new IllegalArgumentException("입력값은 100억 이하의 자연수만 가능합니다.");
		}
		
		int length = (int) Math.log10(n) + 1;
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			arr[i] = (int) (n % 10);
			n /= 10;
		}
		return arr;
	}
}

//int i = 0;
//
//while (0 < n ) {
//	arr[i++] = (int)n % 10;
//}