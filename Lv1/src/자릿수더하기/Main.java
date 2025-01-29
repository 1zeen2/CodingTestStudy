package 자릿수더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        String input = sc.next();
        
        try {
            int n = Integer.parseInt(input);

            if (input.startsWith("0") && input.length() > 1) {
                System.out.println("0으로 시작할 수 없습니다. 다시 입력해주세요.");
            } else {
                sol.solution(n);
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
        }
        sc.close();
    }
}
