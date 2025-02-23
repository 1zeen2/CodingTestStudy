package 핸드폰번호가리기;

public class Solution {
	public String solution(String phone_number) {
		if (phone_number.length() < 4 || 20 < phone_number.length()) {
			throw new IllegalArgumentException("전화번호는 4자리 이상, 20자리 이하로 입력해주세요.");
		}
		
		return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
	}
}