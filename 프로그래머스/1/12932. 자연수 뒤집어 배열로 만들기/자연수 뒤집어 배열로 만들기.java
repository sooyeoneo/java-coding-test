class Solution {
    public int[] solution(long n) {
        
        // 뒤에서부터 한 자리 씩 리턴
        // 문자열로 바꾸고 뒤에서부터 잘라서 배열에 담기
        
        String str = String.valueOf(n); 
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}