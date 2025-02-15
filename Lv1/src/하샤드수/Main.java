package 하샤드수;

import java.util.Scanner;

/* 하샤드 수 구하기 문제.
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * 
 * 제한 조건 (x는 1 이상, 10000 이하인 정수입니다.)
 * 
 * 입출력 예
 * if (x = 10) result true;
 * if (x = 11) result false;
 * if (x = 12) result true;
 * if (x = 13) result false;
 */
public class Main {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("값을 입력해주세요.");
		
			System.out.println(new Solution().solution(sc.nextInt()));
		}
	}
	
}