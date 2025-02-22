package 서울에서김서방찾기;

public class Solution {
	
	public String solution(String[] seoul) {
		
		int index = -1;
		
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equalsIgnoreCase("Kim")) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			throw new IllegalArgumentException("김서방을 찾을 수 없습니다");
		}
		
		return "김서방은 " + index + "에 있다";
	}

}