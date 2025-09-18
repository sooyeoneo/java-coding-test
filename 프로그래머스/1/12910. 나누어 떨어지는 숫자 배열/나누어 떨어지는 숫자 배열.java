class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        
        // 먼저 나누어 떨어지는 수의 개수 구하기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        
        // 나누어 떨어지는 수가 없으면 [-1] 반환
        if (count == 0) {
            return new int[]{-1};
        }
        
        // 결과 배열 만들기
        int[] answer = new int[count];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }
        
        // 선택 정렬로 오름차순 정렬
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
       return answer; 
    }
}