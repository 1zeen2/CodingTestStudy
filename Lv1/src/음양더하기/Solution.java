package 음양더하기;

public class Solution {
	
	public static int solution(int[] absolutes, boolean[] signs) {
		
		int temp = 0;
		
		for (int i = 0; i < absolutes.length; i++) {
			if (absolutes[i] < 1 || 1000 <absolutes[i]) {
				throw new IllegalArgumentException("입력값은 1 이상, 1000 이하의 자연수만 가능합니다.");
			}
			
			temp += signs[i] ? absolutes[i] : -absolutes[i];
		}
		
		return temp;
	}
}