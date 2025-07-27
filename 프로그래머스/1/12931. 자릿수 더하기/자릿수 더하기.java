import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 자리수 를 더하는 문제 배열인가? n이라는 자연수를 배열로 넣고 하나씩 반복해서 더하기 출력
        while(n>0) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}