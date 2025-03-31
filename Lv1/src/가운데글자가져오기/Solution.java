package 가운데글자가져오기;

public class Solution {
	
	public String solution(String s) {
		if (s.length() < 1 || 100 < s.length()) {
			throw new IllegalArgumentException("입력 값의 개수는 1이상 100 이하의 개수만 가능합니다.");
		}
		
		int mid = s.length() / 2;
		
		return (s.length() % 2 == 0) ? s.substring(mid - 1, mid + 1) : s.substring(mid, mid + 1); 
	}
	
}
