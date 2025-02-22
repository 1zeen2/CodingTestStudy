package 콜라츠추측;

public class Solution {
	public int solution(long num) {
		if (num < 1 || 8000000 < num) {
			throw new IllegalArgumentException("입력 값은 1 이상, 8,000,000 이하의 자연수만 가능합니다.");
		}
		int i = 0;
		
		while (num != 1 && i < 500) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = (num * 3) + 1;
			}
			i++;
		}
		
		return (num == 1) ? i : -1;
	}
	
}