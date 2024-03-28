class Solution {
    public int solution(String[] strArr) {
        int[] countArr = new int[31]; // 문자열의 최대 길이는 30이므로 31로 설정
        int maxCount = 0;

        // 각 문자열의 길이를 countArr에 카운트
        for (String str : strArr) {
            countArr[str.length()]++;
        }

        // 가장 많이 등장한 문자열의 개수 찾기
        for (int count : countArr) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // 가장 많이 등장한 문자열의 개수 반환
        return maxCount;
    }
}