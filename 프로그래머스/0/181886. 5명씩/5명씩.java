public class Solution {
    public String[] solution(String[] names) {
        double sets = Math.ceil(names.length / 5.0);
        int index = 0;
        String[] answer = new String[(int) sets];

        // 각 answer 배열 요소를 빈 문자열로 초기화
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }

        for (int i = 0; i < names.length; i += 5) {
            answer[index] += names[i];
            index++;
        }
        return answer;
    }
}
