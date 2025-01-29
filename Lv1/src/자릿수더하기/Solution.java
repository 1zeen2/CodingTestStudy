package 자릿수더하기;

public class Solution {
	public int solution(int n) {
        int answer = 0;
            
        if (n == 0) {
            System.out.println("0 = 0 입니다.");
            return 0;
        }
            
        if (n < 0 || 100000000 < n) {
            System.out.println("입력 값은 100000000 (1억) 이하의 자연수만 입력해주세요.");
            return 0;
        }
        
        String s = String.valueOf(n);
        
        if (s.startsWith("0") && s.length() > 1) {
            System.out.println("0으로 시작할 수 없습니다. 다시 입력해주세요.");
            return 0;
        }

        StringBuilder sb = new StringBuilder();
            
        while(0 < n) {
            answer += n % 10;
            sb.append(n % 10);
            n /= 10;
                
            if (n > 0) {
                sb.append(" + ");
            }
        }
        sb.reverse();
        System.out.println(sb.toString() + " = " + answer + " 입니다.");
        return answer;
    }
}
