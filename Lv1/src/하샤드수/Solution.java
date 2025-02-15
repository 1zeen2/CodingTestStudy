package 하샤드수;

import java.util.*;

public class Solution {
	
	public boolean solution (int x) {
		if (x < 1 || 10000 < x) {
			throw new InputMismatchException("입력값은 1 이상, 10000 이하의 정수만 가능합니다.");
		}
		
		int sum = String.valueOf(x).chars().map(c -> c - '0').sum();
		
		return (x % sum == 0) ? true : false;
	}
	
}