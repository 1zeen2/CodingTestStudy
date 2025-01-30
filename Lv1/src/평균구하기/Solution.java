package 평균구하기;

public class Solution {
    public double solution(int[] arr) {
        if (arr.length < 1 || 100 < arr.length) {
            throw new IllegalArgumentException("arr의 길이는 1 이상, 100 이하여야 합니다.");
        }
        
        double sum = 0;
        
        for (int num : arr) {
            if (num < -10000 || 10000 < num) {
                throw new IllegalArgumentException("arr의 원소는 -10,000 이상 10,000 이하인 정수 입니다.");
            }
            sum += num;
        }
        return sum / arr.length;
    }
}