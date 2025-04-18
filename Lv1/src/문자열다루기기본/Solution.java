package 문자열다루기기본;

public class Solution {

	public boolean solution(String s) {
		if (s.length() < 1 || 8 < s.length()) {
			throw new IllegalArgumentException("입력 값의 길이는 1이상 8이하의 개수만 가능합니다.");
		}
		
		return s.matches("\\d{4}|\\d{6}");
	}
}
