class Solution {
    public String[] solution(String my_string) {
        String[] split = my_string.split(" ");
        int count = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("")) {
                count++;
            }
        }

        String[] answer = new String[split.length - count];
        int index = 0;

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                answer[index] = split[i];
                index++;
            }
        }

        return answer;
    }
}
