import java.util.Arrays;

class Solution {
    public long solution(long n) {

        // 1. 정수 n을 문자열로 바꿈
        String str = String.valueOf(n);    
            
        // 2. 문자열 → 문자 배열
        char[] arr = str.toCharArray();
        
        // 3. 오름차순 정렬
        Arrays.sort(arr);
        
        // 4. 문자 배열 뒤집기 (내림차순)
        StringBuilder sb = new StringBuilder(new String(arr)).reverse();
            
        // 5. 문자열을 long으로 변환해서 리턴
        return Long.parseLong(sb.toString());
    }
}