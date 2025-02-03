package 나머지가1이되는수찾기;

public class Solution {
	public int solution(int n) {
		if (n < 3 || 1000000 < n) {
			throw new IllegalArgumentException("입력값은 3이상 1,000,000 이하의 자연수만 가능합니다.");
		}

		int i = 2;
		
		while (n % i != 1) {
			i++;
		}
		
		return i;
	}
}