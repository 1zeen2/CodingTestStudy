package 약수의개수와덧뺄셈;

public class Solution2 {
	
	public int solution2(int left, int right) {
		int result = 0;

		for (int n = left; n <= right; n++) {
			// 제곱수이면 약수 개수가 홀수 (1, 4, 9, 16, ...)
			if (Math.sqrt(n) % 1 == 0) {
				result -= n;  // 빼기
			} else {
				result += n;  // 더하기
			}
		}

		return result;
	}

}
