import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for (String str : intStrs) {
            if (str.length() < s + l) {
                // s번 인덱스에서 시작하는 부분 문자열의 길이가 l보다 작으면 건너뜀
                continue;
            }

            String substring = str.substring(s, s + l);
            int value = Integer.parseInt(substring);

            if (value > k) {
                result.add(value);
            }
        }

        // List를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}    