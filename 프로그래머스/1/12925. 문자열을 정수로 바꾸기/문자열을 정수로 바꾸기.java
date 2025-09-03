class Solution {
    public int solution(String s) {

        // 첫 글자 '-' 인지 확인해서 음수 여부 판단
        boolean isNegative = s.charAt(0) == '-';
        // 부호가 있으면 숫자 1번째 인덱스부터 시작
        int start = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
        
        int result = 0;
        
        // 한 자리씩 숫자로 바꾸어 누적
        for (int i = start; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        
        // 음수였다면 결과에 음수 부호 붙임
        if (isNegative) {
            result = -result;
        }
        
        return result;
    }
}