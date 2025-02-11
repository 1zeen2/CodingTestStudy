package 정수제곱근판별;

import java.util.*;

/*
 * n의 제곱근이 양수로 존재한다면, 루트n + 1의 제곱을 출력, 없다면 -1 출력
 * ex) if (n == 121) {return 144(11 + 1의 제곱);
 * ex) if (n == 100) {return 121(10 + 1의 제곱);
 * ex) if (n == 3) { return -1}
 * ex) if (n == 5 || n == 7) {return -1}
 */

public class Main {
	public static void main(String[] args) {
		
		// try-with-resources 방식 => try를 벗어나면 close() 메서드가 자동으로 실행됨.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("입력값은 1이상, 50조 이하인 양의 정수만 입력해주세요.");
			
			long n = sc.nextLong();
			
			// Solution 객체는 한 번만 사용되므로 변수를 사용할 필요 없이 바로 호출도 가능.
			System.out.println(new Solution().solution(n));
		}
	}

}