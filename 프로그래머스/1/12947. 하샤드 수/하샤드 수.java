class Solution {
    public boolean solution(int x) {
        int original = x;
        int sum = 0;

        while (x > 0) {
            sum += x % 10; // 1의 자리 더하기
            x /= 10;       // 다음 자리로 이동
        }

        return original % sum == 0;
    }
}
