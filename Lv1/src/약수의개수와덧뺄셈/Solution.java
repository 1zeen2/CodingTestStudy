package 약수의개수와덧뺄셈;

import java.util.ArrayList;

public class Solution {
	
	public int solution(int n, int m) {		
		int result = 0;
		
	/*
	 * 1. n부터 m까지 1씩 증가.
	 * 2. n의 약수와 약수의 개수를 구함
	 * 3. n의 약수가 짝수인 경우 + 홀수인 경우 -를 한다.
	 * 4. n + 1을 해주고 1번부터 반복한다.
	 */
		while (n <= m) {
			ArrayList<Integer> div = new ArrayList<>();
			
			int count = 0;
			
			// n의 약수를 구하는 반복문
			for (int i = 1; i <= n; i++) {
				// n의 약수와 그 개수를 구하는 조건문
				if (n % i == 0) {
					count ++;
					div.add(i);
				}
			}
			
			System.out.println(n + "의 약수는" + div + "입니다. " + "약수의 개수는 " + count + "개 입니다.");
			
			if (count % 2 == 0) {
				result += n;
			} else {
				result -= n;
			}
			
			n++;
		}
		
		return result;
	}

}
