class Solution {
    public int solution(String[] strArr) {
        int[] countArr = new int[strArr.length];
        int answer = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            countArr[i] = strArr[i].length();
        }

        for(int i = 0; i < countArr.length; i++) {
            int count = 1; // 각 길이별 중복 횟수를 세기 위해 반복마다 초기화
            for(int j = i + 1; j < countArr.length; j++) {
                if(countArr[i] == countArr[j]) {
                    count++;
                }
            }
            if(count > answer) {
                answer = count;
            }
        }
        return answer;
    }
}
