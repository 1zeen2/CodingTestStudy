package 짝수와홀수;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Solution sol = new Solution();
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("정수를 입력해주세요.");
            int num = scan.nextInt();
            
            System.out.println(sol.solution(num));
        } catch (InputMismatchException ex) {
            System.out.println("-2147483648 ~ 2147483647 사이의 정수만 입력해주세요.");
        }
    }
}