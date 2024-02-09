class Solution {
    public int solution(int[] date1, int[] date2) {
        int minLength = Math.min(date1.length, date2.length);

        for (int i = 0; i < minLength; i++) {
            if (date1[i] < date2[i]) {
                return 1;
            } else if (date1[i] > date2[i]) {
                return 0;
            }
        }

        // 배열의 일부가 같고, 나머지 길이가 더 긴 배열이 더 큰 것으로 간주
        return (date1.length < date2.length) ? 1 : 0;
    }
}
