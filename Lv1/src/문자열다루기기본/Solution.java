package 문자열다루기기본;

public class Solution {

	public boolean solution(String s) {
		if (s.length() < 1 || 8 < s.length()) {
			throw new IllegalArgumentException("입력 값의 길이는 1이상 8이하의 개수만 가능합니다.");
		}
		
		if (s.length() != 4 && s.length() != 6) return false;
		
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) return false;
		}
		
		return true;
	}
}
