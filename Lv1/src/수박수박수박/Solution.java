package 수박수박수박;

public class Solution {
	
	public String solution(int n) {
		if (n < 1 || 10000 < n) {
			throw new IllegalArgumentException("입력 값은 10,000 이하의 자연수만 가능합니다.");
		}
		
		return "수박".repeat(n / 2) + (n % 2 == 1 ? "수" : "");
	}

}
