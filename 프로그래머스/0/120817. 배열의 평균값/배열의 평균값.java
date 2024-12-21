class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0; // 배열의 모든 값을 담을 변수
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // 배열의 i 번째 수를 sum에 더하기
        }
            
        answer = (double) sum/numbers.length; // sum을 배열의 길이 만큼 나누기
        return answer;
    }
}