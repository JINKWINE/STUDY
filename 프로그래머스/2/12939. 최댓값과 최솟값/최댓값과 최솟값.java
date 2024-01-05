class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        int[] splitNum = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            splitNum[i] = Integer.parseInt(split[i]);
        }

        int max = splitNum[0];
        int min = splitNum[0];

        for (int i = 0; i < splitNum.length; i++) {
            if (splitNum[i] > max) {
                max = splitNum[i];
            }

            if (splitNum[i] < min) {
                min = splitNum[i];
            }
        }

        answer = min + " " + max;

        return answer;
    }
}
