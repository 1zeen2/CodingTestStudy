package 정수제곱근판별;

import java.util.*;

public class Solution {
	public long solution(long n) {
		
		if (n < 1 || 50000000000000L < n) {
			throw new InputMismatchException("1이상, 50조 이하인 양의 정수만 입력해주세요.");
		}
		
		// 이진 탐색을 활용한 제곱근 찾기
		long left = 1, right = n; // 왼쪽(left)과 오른쪽(right) 초기값 설정

	    while (left <= right) { // left가 right보다 작거나 같을 때까지 반복
	        long mid = (left + right) / 2; // 중간 값(mid) 계산
	        long square = mid * mid; // 중간 값의 제곱을 저장

	        if (square == n) { // 중간 값의 제곱이 입력값 n과 같다면
	            return (mid + 1) * (mid + 1); // (중간 값 + 1)의 제곱을 return
	            
	        } else if (square < n) { // 중간 값의 제곱이 n보다 작다면
	            left = mid + 1; // 중간 값보다 큰 수에서 탐색 계속
	            
	        } else { // 중간 값의 제곱이 입력값 n보다 크다면
	            right = mid - 1; // 중간 값보다 작은 수에서 탐색 계속
	        }
	    }

	    return -1; // 제곱근이 정수로 존재하지 않는다면 -1 return
	}
}