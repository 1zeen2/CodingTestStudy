package 문자열내림차순으로배치하기;

import java.util.stream.Collectors;

public class Solution {
	
	public String solution(String s) {
		return s.chars().boxed().sorted((a, b) -> b - a)
				.map(i -> String.valueOf((char)(int)i))
				.collect(Collectors.joining());
	}

}
