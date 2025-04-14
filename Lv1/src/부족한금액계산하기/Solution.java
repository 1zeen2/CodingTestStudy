package 부족한금액계산하기;

public class Solution {
	
	public long solution(int price, int money, int count) {
		if ((price < 1 || 2500 < price) || (money < 1 || 1000000000 < money) || (count < 1 || 2500 < count)) {
			throw new IllegalArgumentException("가격은 1부터 2500 사이, 금액은 1부터 10억 사이, "
					+ "횟수는 1부터 2500 사이의 숫자만 가능합니다.");
		}
		
		// 등차수열 합 공식 n * (n + 1) / 2 사용
		long total = (long) price * count * (count + 1) / 2;
		
		return Math.max(0, total - money); 
	}

}
