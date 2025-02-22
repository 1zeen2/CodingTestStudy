package 없는숫자더하기;

public class Solution {
	public int solution(int[] numbers) {
		if (numbers.length < 1 || 9 < numbers.length) {
			throw new IllegalArgumentException("입력 값의 개수는 1개 이상 9개 이하만 가능합니다.");
		}
		
		int answer = 45;
		
		boolean[] duplicationCheck = new boolean[10];
		
		for (int duplicate : numbers) {
			if (duplicate < 0 || 9 < duplicate) {
				throw new IllegalArgumentException("입력 값의 크기는 0 이상, 9 이하의 자연수만 가능합니다.");
			}
			
			if (duplicationCheck[duplicate]) {
				throw new IllegalArgumentException("중복된 값은 사용할 수 없습니다.");	
			}
			
			duplicationCheck[duplicate] = true;
			
			answer -= duplicate;
		}
		
		return answer;
	}
}