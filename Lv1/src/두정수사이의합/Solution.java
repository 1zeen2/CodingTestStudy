package 두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        // 입력값 Validation
        if (a < -10000000 || 10000000 < a || b < -10000000 || 10000000 < b) {
            throw new IllegalArgumentException("입력값은 -10,000,000 이상, 10,000,000 이하만 가능합니다.");
        }

        // 등차수열의 합 공식에서는 a가 무조건 낮아야 함으로 a가 작은 값이 되도록 변경.
        long first = Math.min(a, b);
        long last = Math.max(a, b);

        // 공차가 1인 등차수열의 합 공식
        return (last - first + 1) * (first + last) / 2;
    }
}